package com.isb.vega.generator.xml.configuration;

import java.util.ArrayList;
import java.util.List;

import com.isb.vega.model.assembly.IAssembly;
import com.isb.vega.model.assembly.IAssemblyFile;
import com.isb.vega.model.assembly.IAssemblyProject;
import com.isb.vega.model.assembly.UtilsAssembly;
import com.isb.vega.model.assembly.profile.multi.IAssemblyValueCategory;
import com.isb.vega.model.core.IVegaProject;
import com.isb.vega.model.operation.IOperation;
import com.isb.vega.model.scenario.IScenario;

import dependencies.MultiProfile;


public class UtilsDependencies {

	/** obtiene el valor de la categoría del ensamblado
	 * @param assemblyValueCategory - categoria del ensamblado
	 * @return valueName - el valor de la categoría del ensamblado
	 */
	public static String obtenerValor(IAssemblyValueCategory[] assemblyValueCategory) {
		String valueName="";
		for (IAssemblyValueCategory iAssemblyValueCategory : assemblyValueCategory) {
			valueName =  iAssemblyValueCategory.getName();
		}
		return valueName;
	}

	/** obtiene los escenarios a partir del assemblyfile del ensamblado obtenido a partir de la conversión del proyecto vega a IAssemblyProject
	 * @param vegaProject - proyecto vega
	 * @param iscenarios - objeto iscenarios vacío 
	 * @param  assemblyFile - objeto assemblyFile vacío
	 * @return iscenarios - escenarios cargados
	 */
	public static  IScenario[] getScenarios(IVegaProject vegaProject,
			IScenario[] iscenarios, IAssemblyFile assemblyFile) {
		if(vegaProject instanceof IAssemblyProject){
			IAssembly assembly = ((IAssemblyProject)vegaProject).getAssembly();
			assemblyFile = assembly.getAssemblyFile();
			iscenarios = UtilsAssembly.getScenarios(assemblyFile);
		}
		return iscenarios;
	}

	/** obtiene la lista de OPS o de OIS a partir del objeto operation - cargado recorriendo los escenarios - que contiene todas las OPS y OIS juntas
	 * @param operations - proyecto vega
	 * @param operation - objeto iscenarios vacío 
	 * @return list - lista de OPS o de OIS dependiendo del parámetro operación que será 1 - OP_OPERATIONS o 2 - OI_OPERATIONS
	 */
	public static List<IOperation> getlist(IOperation[] operations,
			int operation) {
		List<IOperation> list = new ArrayList<IOperation>();
		for (IOperation iOperation : operations) {
			if(iOperation.getOperationType() == operation){
				list.add(iOperation);					
			}	
		}
		return list;
	}
	public static String getOrden( MultiProfile multiprofile)
	{
		String orden="";

		if (multiprofile.getCatCanalMarco() != null && !multiprofile.getCatCanalMarco().toString().equals("")){
			orden = orden.concat(multiprofile.getCatCanalMarco().toString());
			orden = getOrdenNivel(multiprofile, 1,orden);
		}
		if (multiprofile.getCatCompany() != null &&  !multiprofile.getCatCompany().toString().equals("")){
			orden = orden.concat(multiprofile.getCatCompany().toString());
			orden = getOrdenNivel(multiprofile, 2,orden);
		}
		if (multiprofile.getCatEmpresaAsociada() != null && !multiprofile.getCatEmpresaAsociada().toString().equals("")){
			orden = orden.concat(multiprofile.getCatEmpresaAsociada().toString());
			orden = getOrdenNivel(multiprofile, 3,orden);
		}
		if (multiprofile.getCatEstructura() != null && !multiprofile.getCatEstructura().toString().equals("")){
			orden = orden.concat(multiprofile.getCatEstructura().toString());
			orden = getOrdenNivel(multiprofile, 4,orden);
		}
		if (multiprofile.getCatGama() != null  && !multiprofile.getCatGama().toString().equals("")){
			orden = orden.concat(multiprofile.getCatGama().toString());
			orden = getOrdenNivel(multiprofile, 5,orden);
		}
		if (multiprofile.getCatIdioma() != null && !multiprofile.getCatIdioma().equals("")){
			orden = orden.concat(multiprofile.getCatIdioma().toString());
			orden = getOrdenNivel(multiprofile, 6,orden);
		}
		if (multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("")){
			orden = orden.concat(multiprofile.getCatNivelIU().toString());
			orden = getOrdenNivel(multiprofile, 7,orden);
		} 
		if (multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals("")){
			orden = orden.concat(multiprofile.getCatRender().toString());
		}
		return orden;
	}

	private static String getOrdenNivel(MultiProfile multiprofile, int nivel,String orden) {
		switch(nivel){
		case 1:
			if (multiprofile.getCatCompany() != null &&  !multiprofile.getCatCompany().toString().equals("") ||
			multiprofile.getCatEmpresaAsociada() != null && !multiprofile.getCatEmpresaAsociada().toString().equals("")||
			multiprofile.getCatEstructura() != null && !multiprofile.getCatEstructura().toString().equals("") ||
			multiprofile.getCatGama() != null  && !multiprofile.getCatGama().toString().equals("")|| 
			multiprofile.getCatIdioma() != null && !multiprofile.getCatIdioma().equals("") ||
			multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("") ||
			multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		case 2:
			if (	multiprofile.getCatEmpresaAsociada() != null && !multiprofile.getCatEmpresaAsociada().toString().equals("")||
			multiprofile.getCatEstructura() != null && !multiprofile.getCatEstructura().toString().equals("") ||
			multiprofile.getCatGama() != null  && !multiprofile.getCatGama().toString().equals("")|| 
			multiprofile.getCatIdioma() != null && !multiprofile.getCatIdioma().equals("") ||
			multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("") ||
			multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		case 3:
			if (	multiprofile.getCatEstructura() != null && !multiprofile.getCatEstructura().toString().equals("") ||
			multiprofile.getCatGama() != null  && !multiprofile.getCatGama().toString().equals("")|| 
			multiprofile.getCatIdioma() != null && !multiprofile.getCatIdioma().equals("") ||
			multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("") ||
			multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		case 4:
			if (multiprofile.getCatGama() != null  && !multiprofile.getCatGama().toString().equals("")|| 
			multiprofile.getCatIdioma() != null && !multiprofile.getCatIdioma().equals("") ||
			multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("") ||
			multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		case 5:
			if (	multiprofile.getCatIdioma() != null && !multiprofile.getCatIdioma().equals("") ||
			multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("") ||
			multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		case 6:
			if (	multiprofile.getCatNivelIU() != null  && !multiprofile.getCatNivelIU().toString().equals("") ||
			multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		case 7:
			if (	multiprofile.getCatRender() != null && !multiprofile.getCatRender().toString().equals(""))
				orden = orden.concat("|");
			break;
		}
		return orden;


	}

}
