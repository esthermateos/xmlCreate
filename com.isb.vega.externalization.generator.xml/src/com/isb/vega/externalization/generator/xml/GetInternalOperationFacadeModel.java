/**
 * 
 */
package com.isb.vega.externalization.generator.xml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import dependencies.Ensamblado;
import dependencies.Fachada;
import dependencies.OI;
import dependencies.OP;

/**
 * @author emateos
 *
 */
public class GetInternalOperationFacadeModel {

	
	public static List<OI> getTotalInternalOperations(Ensamblado ensamblado) {
		List<OI> listOI= new ArrayList<OI>();
		EList<OP> listOP = ensamblado.getEOP();
		for (OP op : listOP) {
			EList<Fachada> opFacades = op.getEFachada();
			for (Fachada fachada : opFacades) {
				OI initOI = fachada.getEOI();
				if(initOI!=null){
					if(!listOI.contains(initOI)){
						listOI.add(initOI);	
					}
					getInternalOperations(initOI, listOI);
				}
				
			}

		}	
		
		for (OP op : listOP){
			EList<OI> opOIs = op.getEOI();
			for (OI opOI : opOIs) {
				if(opOI!=null){
					if(!listOI.contains(opOI)){
						listOI.add(opOI);	
					}
					getInternalOperations(opOI, listOI);
				}
			}
		}
		return listOI;
	}	
	

	public static List<OI> getInternalOperations(OI oi, List<OI> listOI) {
		EList<Fachada> listFacades = oi.getEFachada();
		for (Fachada fachada : listFacades) {
			OI OIfacade = fachada.getEOI();
			if(OIfacade!=null){
				if(!listOI.contains(OIfacade)){
					listOI.add(OIfacade);
				}
				getInternalOperations(OIfacade, listOI);
			}
		}
		List <OI> listIO = oi.getEstadoLlamadaOI();
		for (OI internalOI : listIO) {
			if(!listOI.contains(internalOI)){
				listOI.add(internalOI);
			}
			getInternalOperations(internalOI, listOI);
		}
		return listOI;
	}
	
	//Método que comprueba si se usa le catálogo de Contenido en la aplicación.
	public static boolean isCatCon(Ensamblado ensamblado) {
		boolean exist = false;
		List<OI> listOI = getTotalInternalOperations(ensamblado);
		for (OI oi : listOI) {
			if(oi.getLnName().equalsIgnoreCase("ALN_CCFAC_Personalizacion") || 
					oi.getLnName().equalsIgnoreCase("ALN_CCFAC_Catalogo") || 
					oi.getLnName().equalsIgnoreCase("ALN_CCFAC_Principal")){
				exist =true;
				break;				
			}
		}		
		return exist;
	}	

}
