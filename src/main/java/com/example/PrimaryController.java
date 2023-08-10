package com.example;

import java.util.ArrayList;
import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtNome; 
    @FXML TextArea txtAlunos; 

    ArrayList <String>nomes = new ArrayList<>(); 

    public void adicionar(){
        String nome = txtNome.getText(); 
        nomes.add(nome);
        nomes.sort((o1, o2) ->  o1.compareTo(o2));
        mostrarAlunos();
    }

    public void mostrarAlunos(){
        txtAlunos.clear(); 
        for (var nome: nomes){ 
            txtAlunos.appendText(nome + "\n");
        }      
     
     }
}

