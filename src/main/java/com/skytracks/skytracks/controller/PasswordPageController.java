package com.skytracks.skytracks.controller;


import com.skytracks.skytracks.data.AccountDao;
import com.skytracks.skytracks.models.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.net.URL;
import java.util.ResourceBundle;


public class PasswordPageController implements Initializable {
    @FXML
    private PasswordField txtConfirmpassword;

    @FXML
    private PasswordField txtCurrentpassword;

    @FXML
    private PasswordField txtNewpassword;
	

	@FXML
	private Label labelMessage;

	 @Override
	    public void initialize(URL location, ResourceBundle resources) {

	    }
	 
	 @FXML
	 public void updatePassword(ActionEvent event) {
		 
	       Account account = new Account();
	       AccountDao accountDao = new AccountDao();
	       
		 if(txtCurrentpassword.getText().equals(account.getCurrentUser().getPassword() )) {
             if(txtNewpassword.getText().equals(txtConfirmpassword.getText())) {
            	  
		       account.setPassword(txtNewpassword.getText().trim());
		       accountDao.update(Account.getCurrentUser().getId(),account);
		       labelMessage.setText("Password Changed");
		       
             }else {
            	 labelMessage.setText(" Incorrect New Password or Confirm Password");
            }
             
		 }else {
				labelMessage.setText(" incorrect Current Password ");
			}
		 }
	 
	 
	 
	 }

