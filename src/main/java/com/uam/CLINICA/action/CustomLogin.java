package com.uam.CLINICA.action;

import java.util.*;

import org.openxava.util.*;

import com.openxava.naviox.actions.*;
import com.openxava.naviox.impl.*;
import com.uam.CLINICA.model.*;

import com.uam.CLINICA.service.*;

public class CustomLogin extends ForwardToOriginalURIBaseAction {
	
	public void execute() throws Exception {		

		if (getErrors().contains()) return; 
		String userName = getView().getValueString("user");
		String password = getView().getValueString("password");
		if (Is.emptyString(userName, password)) { 
			addError("Usuario No Autorizado.");
			return;
		}		
		
		IDAO dao = new ImplDAO();
		List<Usuario> lista = new ArrayList<>();
		lista = dao.get("Usuario.findByPassword",Usuario.class,userName, password);
		if (lista == null || lista.isEmpty() || lista.size() == 0) {
			addError("Usuario No Autorizado.");
			return;
		}
		SignInHelper.signIn(getRequest(), userName); 
		getView().reset();
		getContext().resetAllModulesExceptCurrent(getRequest()); 
		forwardToOriginalURI();
	}

}
