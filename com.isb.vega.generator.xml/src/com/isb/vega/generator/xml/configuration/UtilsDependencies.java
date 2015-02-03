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

}
