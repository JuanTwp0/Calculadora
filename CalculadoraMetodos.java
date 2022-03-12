/*Amaral Ramirez Juan Manuel
 4a Ing. en sistemas computacionales
 k01
*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculadoraMetodos extends JFrame implements ActionListener {
    
    
    JLabel label1,label2;
    JButton btnsuma,btnrest,btnmulti,btndiv,btnborrar,btnex;
    JTextField conte1,conte2,conteresul;
    
    public CalculadoraMetodos(){
      
      super("Calculadora");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Controles();
      setSize(380,200);
      setVisible(true);
    }
    
   public void Controles(){
   
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout());
      
      label1 = new JLabel("Numero 1:");
      contenedor.add(label1);
      
      conte1 = new JTextField(30);
      contenedor.add(conte1);
      
      label2 = new JLabel("Numero 2:");
      contenedor.add(label2);
      
      conte2 = new JTextField(30);
      contenedor.add(conte2);
      
      btnsuma = new JButton("+");
      contenedor.add(btnsuma);
      btnsuma.addActionListener(this);
      
      btnrest = new JButton("-");
      contenedor.add(btnrest);
      btnrest.addActionListener(this);
      
      btnmulti = new JButton("x");
      contenedor.add(btnmulti);
      btnmulti.addActionListener(this);
      
      btndiv = new JButton("/");
      btndiv.addActionListener(this);
      contenedor.add(btndiv);

      conteresul = new JTextField(10);
      contenedor.add(conteresul);
      
      btnborrar = new JButton("Borrar");
      contenedor.add(btnborrar);
      btnborrar.addActionListener(this);
      
      btnex=new JButton("Salir");
      contenedor.add(btnex);
      btnex.addActionListener(this);
   }
  
  
   public void actionPerformed(ActionEvent e) {
     double  num1,num2,resu;
     String resultado;
     if (e.getSource()==btnsuma) {
      
      if(conte1.getText().equals("") || conte2.getText().equals(""))
         {
          error();
         }
      
         else{
          num1=Double.parseDouble(conte1.getText());
          num2=Double.parseDouble(conte2.getText());
          resu=num1+num2;
          resultado=String.valueOf(resu);
          conteresul.setText(resultado);
         }          
       }
        
      if (e.getSource()==btnrest) {
         if(conte1.getText().equals("") || conte2.getText().equals("")){
         error(); 
         }
         else{
          num1=Double.parseDouble(conte1.getText());
          num2=Double.parseDouble(conte2.getText());
          resu=num1-num2;
          resultado=String.valueOf(resu);
          conteresul.setText(resultado);
         }          
        } 
        if (e.getSource()==btnmulti) {
         if(conte1.getText().equals("") || conte2.getText().equals("")){
          error(); 
         }
         else{
          num1=Double.parseDouble(conte1.getText());
          num2=Double.parseDouble(conte2.getText());
          resu=num1*num2;
          resultado=String.valueOf(resu);
          conteresul.setText(resultado);
         }          
        }
        if (e.getSource()==btndiv) {
         if(conte1.getText().equals("") || conte2.getText().equals(""))
         {
          error();
         }
         
         else{
          num1=Double.parseDouble(conte1.getText());
          num2=Double.parseDouble(conte2.getText());
          resu=num1/num2;
          resultado=String.format("%.4f",resu);
          conteresul.setText(resultado);
         if(conte1.getText().equals("0") || conte2.getText().equals("0"))
         {
            conteresul.setText("ERROR");
            JOptionPane.showMessageDialog(null, "DIVICION ENTRE 0 = 0",
            "Error",JOptionPane.ERROR_MESSAGE);
         }
          
           
         }  
        }
         
        if (e.getSource()==btnborrar){
        JOptionPane.showMessageDialog(null, "Puede continuar",
         "Borrar",JOptionPane.INFORMATION_MESSAGE);
         conte1.setText("");
            conte2.setText("");
            conteresul.setText("");
       } 
        if(e.getSource()==btnex)
        {
         JOptionPane.showMessageDialog(null, "Programador:\n\r Amaral Ramirez Juan Manuel",
         "Thanks <3",JOptionPane.INFORMATION_MESSAGE);
         System.exit(0);   
        }
    }
    public void error()
    {
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         
    }
    
    
    
    
}