
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alvar
 */
public class Pantalla_juego extends javax.swing.JFrame {

    //Distintas variables del juego
    private int aleatorio;
    private String personaje_aleatorio;
    private int personaje_aleatorio1;
    private String mensaje_ganador = "¡HAS GANADO!";
    private String mensaje_perdedor = "¡NO FALLASTE!" + " " + "Inténtelo de nuevo";
    private int count = 0;
    
    //Array de personajes
    Personajes [] arrayPersonajes = new Personajes [25];
 
    //Objetos de las clases para escribir en un fichero
    FileWriter fichero = null;
    PrintWriter pw = null;
    
    //Objetos de las clases para leer en un fichero
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
        
    //ArrayList para las puntuaciones
    ArrayList puntuaciones = new ArrayList();
    
    
    public Pantalla_juego() {
        
        //Inicializacion de la primera posición del array de puntuaciones por si el jugador adivina el personaje
        if(count==0){
             puntuaciones.add(0,0);   
        }
       
        
        //Creación del personaje aleatorio
        
    aleatorio = (int)(Math.random()*25);
       
        
        //Instanciar los personajes
        
        arrayPersonajes [0] = new Personajes("Alex","hombre","","","","bigote","pelo","","contento","","","moreno","");
        arrayPersonajes [1] = new Personajes("Alfred","hombre","","","","bigote","pelo","","","tiste","","","pelirrojo");
        arrayPersonajes [2] = new Personajes("Anita","","mujer","","","","pelo","","contento","","rubio","","");
        arrayPersonajes [3] = new Personajes("Anne","","mujer","","","","pelo","","contento","","","moreno","");
        arrayPersonajes [4] = new Personajes("Bernard","hombre","","sombrero","","","pelo","","","triste","","moreno","");
        arrayPersonajes [5] = new Personajes("Bill","hombre","","","","","","calvo","contento","","","","pelirrojo");
        arrayPersonajes [6] = new Personajes("Charles","hombre","","","","bigote","pelo","","contento","","rubio","","");
        arrayPersonajes [7] = new Personajes("Claire","","mujer","sombrero","gafas","","pelo","","contento","","","","pelirrojo");
        arrayPersonajes [8] = new Personajes("David","hombre","","","","","pelo","","contento","","rubio","","");
        arrayPersonajes [9] = new Personajes("Eric","hombre","","sombrero","","","pelo","","contento","","rubio","","");
        arrayPersonajes [10] = new Personajes("Frans","hombre","","","","","pelo","","contento","","","","pelirrojo");
        arrayPersonajes [11] = new Personajes("George","hombre","","sombrero","","","pelo","","","triste","","","");
        arrayPersonajes [12] = new Personajes("Herman","hombre","","","","","","calvo","contento","","","","pelirrojo");
        arrayPersonajes [13] = new Personajes("Joe","hombre","","","gafas","","pelo","","contento","","rubio","","");
        arrayPersonajes [14] = new Personajes("Maria","","mujer","sombrero","","","pelo","","contento","","","moreno","");
        arrayPersonajes [15] = new Personajes("Max","hombre","","","","bigote","pelo","","contento","","","moreno","");
        arrayPersonajes [16] = new Personajes("Paul","hombre","","","gafas","","pelo","","contento","","","","");
        arrayPersonajes [17] = new Personajes("Peter","hombre","","","","","pelo","","contento","","","","");
        arrayPersonajes [18] = new Personajes("Philip","hombre","","","","","pelo","","contento","","","moreno","");
        arrayPersonajes [19] = new Personajes("Richard","hombre","","","","bigote","","calvo","contento","","","moreno","");
        arrayPersonajes [20] = new Personajes("Robert","hombre","","","","","pelo","","","triste","","moreno","");
        arrayPersonajes [21] = new Personajes("Sam","hombre","","","gafas","","","calvo","contento","","","","");
        arrayPersonajes [22] = new Personajes("Susan","","mujer","","","","pelo","","contento","","","","");
        arrayPersonajes [23] = new Personajes("Tom","hombre","","","gafas","","","calvo","contento","","","moreno","");
       
        initComponents();
       
        //Código para ver por consola quien es el personaje aleatorio al que hay que adivinar
         personaje_aleatorio = arrayPersonajes[aleatorio].getNombre();
         System.out.println("El personaje aleatorio es: " + personaje_aleatorio);  
                   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla_juego_completa = new javax.swing.JPanel();
        pantalla_personajes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pantalla_preguntas = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cuadro_puntuaciones = new javax.swing.JTextField();
        nombre_jugador = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        contador_puntos = new javax.swing.JLabel();
        texto_puntos = new javax.swing.JLabel();
        boton_puntuaciones = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        pantalla_botones = new javax.swing.JPanel();
        preguntar = new javax.swing.JButton();
        texto_respuesta = new javax.swing.JTextField();
        resolver = new javax.swing.JButton();
        respuesta_adivinar = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pantalla_juego_completa.setBackground(new java.awt.Color(153, 0, 51));

        pantalla_personajes.setBackground(new java.awt.Color(153, 0, 51));
        pantalla_personajes.setLayout(new java.awt.GridLayout(4, 6, 5, -20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alex.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alfred.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Anita.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Anne.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bernard.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bill.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Charles.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Claire.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/David.jpg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(60, 10));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eric.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frans.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/George.jpg"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(59, 89));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Herman.jpg"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel13);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Joe.jpg"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Maria.jpg"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel15);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Max.jpg"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Paul.jpg"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Peter.jpg"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Philip.jpg"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Richard.jpg"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Robert.jpg"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sam.jpg"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel22);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Susan.jpg"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel23);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tom.jpg"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        pantalla_personajes.add(jLabel24);

        pantalla_preguntas.setBackground(new java.awt.Color(153, 0, 51));

        jComboBox1.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la pregunta:", "¿Es hombre?", "¿Es mujer?", "¿Lleva sombrero?", "¿Lleva gafas?", "¿Tiene bigote?", "¿Tiene pelo?", "¿Está calvo?", "¿Está contento?", "¿Está triste?", "¿Es rubio?", "¿Es moreno?", "¿Es pelirrojo?", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        cuadro_puntuaciones.setBackground(new java.awt.Color(255, 255, 204));
        cuadro_puntuaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cuadro_puntuaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nombre_jugador.setBackground(new java.awt.Color(255, 255, 204));
        nombre_jugador.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel28.setBackground(new java.awt.Color(255, 255, 51));
        jLabel28.setFont(new java.awt.Font("Snap ITC", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 153, 102));
        jLabel28.setText("Nombre del jugador:");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen pregunta.jpg"))); // NOI18N

        contador_puntos.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        contador_puntos.setForeground(new java.awt.Color(255, 255, 255));
        contador_puntos.setText("0");

        texto_puntos.setBackground(new java.awt.Color(255, 255, 255));
        texto_puntos.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        texto_puntos.setForeground(new java.awt.Color(255, 255, 255));
        texto_puntos.setText("Puntos:");

        boton_puntuaciones.setBackground(new java.awt.Color(0, 0, 153));
        boton_puntuaciones.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        boton_puntuaciones.setForeground(new java.awt.Color(255, 255, 255));
        boton_puntuaciones.setText("Ver puntuación");
        boton_puntuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_puntuacionesActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Snap ITC", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Puntuaciones");

        javax.swing.GroupLayout pantalla_preguntasLayout = new javax.swing.GroupLayout(pantalla_preguntas);
        pantalla_preguntas.setLayout(pantalla_preguntasLayout);
        pantalla_preguntasLayout.setHorizontalGroup(
            pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_preguntasLayout.createSequentialGroup()
                .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombre_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                                .addComponent(texto_puntos)
                                .addGap(18, 18, 18)
                                .addComponent(contador_puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cuadro_puntuaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)))
                            .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(boton_puntuaciones)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pantalla_preguntasLayout.setVerticalGroup(
            pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pantalla_preguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contador_puntos)
                            .addComponent(texto_puntos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addGap(21, 21, 21))
                    .addGroup(pantalla_preguntasLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cuadro_puntuaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_puntuaciones)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pantalla_botones.setBackground(new java.awt.Color(153, 0, 51));

        preguntar.setBackground(new java.awt.Color(0, 0, 153));
        preguntar.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        preguntar.setForeground(new java.awt.Color(255, 255, 255));
        preguntar.setText("Preguntar");
        preguntar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preguntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntarActionPerformed(evt);
            }
        });

        texto_respuesta.setBackground(new java.awt.Color(255, 255, 153));
        texto_respuesta.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        texto_respuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto_respuesta.setText("Respuestas");

        resolver.setBackground(new java.awt.Color(0, 102, 51));
        resolver.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        resolver.setForeground(new java.awt.Color(255, 255, 255));
        resolver.setText("Resolver");
        resolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resolverMouseClicked(evt);
            }
        });
        resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverActionPerformed(evt);
            }
        });

        respuesta_adivinar.setBackground(new java.awt.Color(255, 255, 204));
        respuesta_adivinar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        respuesta_adivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta_adivinarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 102));
        jLabel25.setText("¿Sabes quien es?");

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel27.setText("Escribe el nombre del personaje y presione resolver");

        javax.swing.GroupLayout pantalla_botonesLayout = new javax.swing.GroupLayout(pantalla_botones);
        pantalla_botones.setLayout(pantalla_botonesLayout);
        pantalla_botonesLayout.setHorizontalGroup(
            pantalla_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_botonesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pantalla_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preguntar)
                    .addComponent(texto_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantalla_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_botonesLayout.createSequentialGroup()
                        .addComponent(respuesta_adivinar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resolver))
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        pantalla_botonesLayout.setVerticalGroup(
            pantalla_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_botonesLayout.createSequentialGroup()
                .addGroup(pantalla_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantalla_botonesLayout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18))
                    .addGroup(pantalla_botonesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(preguntar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pantalla_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuesta_adivinar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolver)
                    .addComponent(texto_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout pantalla_juego_completaLayout = new javax.swing.GroupLayout(pantalla_juego_completa);
        pantalla_juego_completa.setLayout(pantalla_juego_completaLayout);
        pantalla_juego_completaLayout.setHorizontalGroup(
            pantalla_juego_completaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_juego_completaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pantalla_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pantalla_juego_completaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pantalla_juego_completaLayout.createSequentialGroup()
                        .addComponent(pantalla_preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pantalla_juego_completaLayout.setVerticalGroup(
            pantalla_juego_completaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_juego_completaLayout.createSequentialGroup()
                .addGroup(pantalla_juego_completaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pantalla_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantalla_juego_completaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pantalla_preguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pantalla_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pantalla_juego_completa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantalla_juego_completa, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        Pantalla_principal inicio = new Pantalla_principal();
        inicio.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void preguntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntarActionPerformed
          
        //Código para contar las veces que se hace click en este jbutton y contar los puntos
        count++;
        String numero = String.valueOf(count);
        contador_puntos.setText(numero);
        
         //Esctructura de control para añadir las puntuaciones al arryalist de puntuaciones
         if(count>0){
             puntuaciones.add(contador_puntos.getText());
         }
       
     
       // Creacion de código para la escritura en ficheros
        
             try
        {
            fichero = new FileWriter("puntuaciones.txt");
            pw = new PrintWriter(fichero);
            
            
            for (int i = 0; i<puntuaciones.size();i++){
                pw.println(nombre_jugador.getText() + " " + puntuaciones.get(i));
            
            }
            
        }   
        catch (IOException e)
        {
            System.out.println("Error de escritura del fichero: " + e.toString());
        }
        finally
        {
            try
            {
                pw.close();
                fichero.close();
            }
            catch (IOException e2)
            {
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
        
        //Código para realizar las preguntas
        
        //Primera pregunta
        if(jComboBox1.getSelectedIndex()== 1){
            if(arrayPersonajes[aleatorio].getHombre().equals("hombre")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        }
        //Segunda pregunta
        if(jComboBox1.getSelectedIndex()== 2){
            if(arrayPersonajes[aleatorio].getMujer().equals("mujer")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }       
    }                                        
        //Tercera pregunta      
        if(jComboBox1.getSelectedIndex()== 3){
            if(arrayPersonajes[aleatorio].getSombrero().equals("sombrero")){
               texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }      
        //Cuarta pregunta
         if(jComboBox1.getSelectedIndex()== 4){
            if(arrayPersonajes[aleatorio].getGafas().equals("gafas")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Quinta pregunta
         if(jComboBox1.getSelectedIndex()== 5){
            if(arrayPersonajes[aleatorio].getBigote().equals("bigote")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Sexta pregunta
         if(jComboBox1.getSelectedIndex()== 6){
            if(arrayPersonajes[aleatorio].getPelo().equals("pelo")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Séptima pregunta
         if(jComboBox1.getSelectedIndex()== 7){
            if(arrayPersonajes[aleatorio].getCalvo().equals("calvo")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Octava pregunta
         if(jComboBox1.getSelectedIndex()== 8){
            if(arrayPersonajes[aleatorio].getContento().equals("contento")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Novena pregunta
         if(jComboBox1.getSelectedIndex()== 9){
            if(arrayPersonajes[aleatorio].getTriste().equals("triste")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Décima pregunta
         if(jComboBox1.getSelectedIndex()== 10){
            if(arrayPersonajes[aleatorio].getRubio().equals("rubio")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Undécima pregunta
         if(jComboBox1.getSelectedIndex()== 11){
            if(arrayPersonajes[aleatorio].getMoreno().equals("moreno")){
                texto_respuesta.setText("¡Verdadero!");
            }else{
                texto_respuesta.setText("¡Falso!");
            }
        
    }
         //Duodécima pregunta
         if(jComboBox1.getSelectedIndex()== 12){
            if(arrayPersonajes[aleatorio].getPelirrojo().equals("pelirrojo")){
               texto_respuesta.setText("¡Verdadero!");
            }else{
               texto_respuesta.setText("¡Falso!");
            }
        
        }
   
    }//GEN-LAST:event_preguntarActionPerformed

    private void resolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resolverActionPerformed

    private void resolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resolverMouseClicked
             
        if(respuesta_adivinar.getText().equals(arrayPersonajes[aleatorio].getNombre())){
           JOptionPane.showMessageDialog(this,mensaje_ganador); 
        }else{
            JOptionPane.showMessageDialog(this,mensaje_perdedor);
        }
    }//GEN-LAST:event_resolverMouseClicked

    private void respuesta_adivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuesta_adivinarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuesta_adivinarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg"))); 
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg"))); 
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg"))); 
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg")));
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tachado.jpg"))); 
    }//GEN-LAST:event_jLabel24MouseClicked

    private void boton_puntuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntuacionesActionPerformed
        
        //Creamos el código para leer en nuestro fichero de puntuaciones
        try{
            
        archivo = new File("puntuaciones.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        
        //Se crea un array para poder representar la puntuación del jugador
       String [] texto_puntos = new String [br.read()];
       
        String linea;
        int i = 0;       
        while((linea = br.readLine()) != null){
            i++;           
            texto_puntos[i]=linea;
            cuadro_puntuaciones.setText(texto_puntos[i]);
         }
            
        }catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        }finally{
            try{
                br.close();
                fr.close();
            }catch (IOException e2){
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
        
        
    }//GEN-LAST:event_boton_puntuacionesActionPerformed
    
         
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_puntuaciones;
    private javax.swing.JLabel contador_puntos;
    private javax.swing.JTextField cuadro_puntuaciones;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField nombre_jugador;
    private javax.swing.JPanel pantalla_botones;
    private javax.swing.JPanel pantalla_juego_completa;
    private javax.swing.JPanel pantalla_personajes;
    private javax.swing.JPanel pantalla_preguntas;
    private javax.swing.JButton preguntar;
    private javax.swing.JButton resolver;
    private javax.swing.JTextField respuesta_adivinar;
    private javax.swing.JLabel texto_puntos;
    private javax.swing.JTextField texto_respuesta;
    // End of variables declaration//GEN-END:variables

}