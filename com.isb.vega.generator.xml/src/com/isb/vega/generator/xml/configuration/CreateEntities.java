package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.List;

import com.isb.vega.model.assembly.IAssemblyFileData;
import com.isb.vega.model.assembly.profile.multi.IAssemblyCategoryProfile;
import com.isb.vega.model.assembly.profile.multi.IAssemblyCategoryProfileContainer;
import com.isb.vega.model.assembly.profile.multi.IAssemblyValueCategory;
import com.isb.vega.model.assembly.settings.IAssemblySettingsContainer;
import com.isb.vega.model.assembly.settings.IBasicSettingsContainer;
import com.isb.vega.model.assembly.settings.ISetting;
import com.isb.vega.model.operation.flow.IFlowOperationData;
import com.isb.vega.model.operation.flow.IState;
import com.isb.vega.model.operation.flow.state.facade.IFacadeInterfaceState;

import dependencies.DependenciesFactory;
import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.HOST;
import dependencies.MultiProfile;
import dependencies.OP;
import dependencies.Security;

public class CreateEntities {

	static Fachada fachada;
	/** Rellena la entidad fachada a partir del State proporcionado.
	  * @param dependencies - Factoría de entidades del modelo
	  * @param iState - estado de interfaz de fachada
	 * @return 
	  * @return listFachada - lista de fachadas cargadas
	  */
	public static Fachada createFacades(DependenciesFactory dependencies,
									 IState iState) {
		List<Fachada> listFachada = new ArrayList<>();
		if(iState instanceof IFacadeInterfaceState){
			IFacadeInterfaceState facadeState = (IFacadeInterfaceState)iState;					
			fachada = dependencies.createFachada();
			fachada.setFacadeName(facadeState.getFacade());
			fachada.setMethodName(facadeState.getName());
			fachada.setInterfazName(facadeState.getFacadeInterface());
			listFachada.add(fachada);
		}
		return fachada;
	}
	
	/** Rellena la entidad OP a partir del IFlowOperationData proporcionado.
	  * @param iFlowOperationData -
	  * @param dependencies - Factoría de entidades del modelo
	 * @return 
	  * @return listOP - lista de ops cargadas
	*/
	public static OP createOPs(DependenciesFactory dependencies,
								 IFlowOperationData iFlowOperationData,Ensamblado ensamblado) {
		List<OP> listOP = new ArrayList<>();
		OP op = dependencies.createOP();	
		op.setOpName(iFlowOperationData.getName());
		op.setVersion(iFlowOperationData.getVersion());
		op.setLpName(iFlowOperationData.getParent().getParent().getParent().getElementId());
		listOP.add(op);
		ensamblado.setEOP(op);
		return op;
	}
	
	
	/** Rellena la entidad MULTIPROFILE 
	  * @param assemblyFileData - Datos del fichero del ensamblado
	  * @param dependencies - Factoría de entidades del modelo
	*/
	public static void createMultiProfile(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		IAssemblyCategoryProfileContainer assemblyCategoryContainer = assemblyFileData.getAssemblyCategoryContainer();
		IAssemblyCategoryProfile[] categories = assemblyCategoryContainer.getCategories();
		MultiProfile multiprofile = dependencies.createMultiProfile();
		for (IAssemblyCategoryProfile iAssemblyCategoryProfile : categories) {
			setValuesMultiProfiles(iAssemblyCategoryProfile, multiprofile);
		}
		ensamblado.setEMultiProfile(multiprofile);
	}
	
	
	/** Rellena los atributos de la entidad MULTIPROFILE dependiendo del nombre del nombre del AssemblyCategoryProfile
	  * @param iAssemblyCategoryProfile - objeto que proporciona el contenedor del perfil múltiple de vega.
	  * @param multiprofile - entidad MULTIPROFILE
	*/
	public static void setValuesMultiProfiles(
			IAssemblyCategoryProfile iAssemblyCategoryProfile, MultiProfile multiprofile) {
			IAssemblyValueCategory[] assemblyValueCategory = iAssemblyCategoryProfile.getAssemblyValueCategoryContainer().getValues();
			switch (iAssemblyCategoryProfile.getName()) {
				case "CanalMarco":
					multiprofile.setCatCanalMarco(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "Empresa":
					multiprofile.setCatCompany(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "EmpresaAsociada":
					multiprofile.setCatEmpresaAsociada(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "Estructura":
					multiprofile.setCatEstructura(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "Gama":
					multiprofile.setCatGama(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "Idioma":
					multiprofile.setCatIdioma(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "NivelIU":
					multiprofile.setCatNivelIU(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				case "Render":
					multiprofile.setCatRender(UtilsDependencies.obtenerValor(assemblyValueCategory));
					break;
				default:
					break;
			}

	}
	
	/** Rellena la entidad SECURITY a partir del AssemblyFileData proporcionado.
	  * @param assemblyFileData - datos del fichero del ensamblado
	  * @param dependencies - Factoría de entidades del modelo
	*/
	public static void createSecurity(IAssemblyFileData assemblyFileData, DependenciesFactory dependencies, Ensamblado ensamblado) {
		Security security = dependencies.createSecurity();
		IAssemblySettingsContainer assemblySettingsContainer = assemblyFileData.getAssemblySettingsContainer();
	    IBasicSettingsContainer basicSettingContainer = (IBasicSettingsContainer) assemblySettingsContainer.getAdvancedSettingsContainer();
	    ensamblado.setEEnsamblado(security);
	    ISetting[] setting = basicSettingContainer.getSettings();
	    for (ISetting iSetting : setting) {
	    	String value = iSetting.getValue();
	    	if (iSetting.getElementId().equals("TrxOp.ProtocolsUsed.Alias.Ctg")){
	    		
	    		
	    	}
		}
	    //security.setAutentication(basicSettingContainer.);
	}
	
}
