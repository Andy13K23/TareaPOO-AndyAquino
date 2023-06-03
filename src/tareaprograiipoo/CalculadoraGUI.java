import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tareaprograiipoo.CalculadoraEspecial;

public class CalculadoraGUI extends JFrame {
    private JTextField display;
    private JButton[] digitButtons;
    private JButton[] operatorButtons;
    private JButton clearButton;
    private CalculadoraEspecial calculadora;
    private String currentNumber;

    public CalculadoraGUI() {
        //ventana principal
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(350, 400));
        getContentPane().setBackground(new Color(23, 23, 23));

        //display de la calculadora
        display = new JTextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(280, 65));
        display.setFont(new Font("Comic Sans", Font.ITALIC, 30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        add(display, BorderLayout.NORTH);

        //botones numéricos
        JPanel digitsPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        digitButtons = new JButton[10];
        for (int i = 1; i <= 9; i++) {
            digitButtons[i] = createDigitButton(i);
            digitsPanel.add(digitButtons[i]);
        
        }
        digitButtons[0] = createDigitButton(0);
        digitsPanel.add(digitButtons[0]);
        digitsPanel.setBackground(Color.DARK_GRAY); // Color de fondo
        add(digitsPanel, BorderLayout.CENTER);

        // Crear el panel para los botones de operadores
        JPanel operatorsPanel = new JPanel(new GridLayout(6, 2, 5, 5));
        operatorButtons = new JButton[11];
        operatorButtons[0] = createOperatorButton("+");
        operatorButtons[1] = createOperatorButton("-");
        operatorButtons[2] = createOperatorButton("*");
        operatorButtons[3] = createOperatorButton("/");
        operatorButtons[4] = createOperatorButton("=");
        operatorButtons[5] = createOperatorButton("√");
        operatorButtons[6] = createOperatorButton("P-C");
        operatorButtons[7] = createOperatorButton("A-C");
        operatorButtons[8] = createOperatorButton("A-T");
        operatorButtons[9] = createOperatorButton("A-C");
        operatorButtons[10] = createOperatorButton("A-R");
        
        for (int i = 0; i < 11; i++) {
            operatorsPanel.add(operatorButtons[i]);
        }
        operatorsPanel.setBackground(Color.DARK_GRAY); // Color de fondo gris
        add(operatorsPanel, BorderLayout.EAST);

        // boton clear
        clearButton = new JButton("C");
        clearButton.setFont(new Font("Comic", Font.BOLD, 20));
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.black);
        operatorsPanel.add(clearButton);

        calculadora = new CalculadoraEspecial("Andy");
        currentNumber = "";

        //listeners botones
        for (int i = 0; i <= 9; i++) {
            final int digit = i;
            digitButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    currentNumber += digit;
                    display.setText(currentNumber);
                }
            });
        }

        operatorButtons[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber += "+";
                display.setText(currentNumber);
            }
        });
        operatorButtons[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber += "-";
                display.setText(currentNumber);
            }
        });
        operatorButtons[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber += "*";
                display.setText(currentNumber);
            }
        });
        operatorButtons[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentNumber += "/";
                display.setText(currentNumber);
            }
        });
        operatorButtons[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                double result = evaluarExpresion(expression);
                display.setText(String.valueOf(result));
                currentNumber = "";
            }
        });
        operatorButtons[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                double numero = Double.parseDouble(expression);
                double resultado = calculadora.raizCuadrada(numero);
                display.setText(String.valueOf(resultado));
                currentNumber = "";
            }
        });
        operatorButtons[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                double radio = Double.parseDouble(expression);
                double resultado = calculadora.calcularPerimetroCirculo(radio);
                display.setText(String.valueOf(resultado));
                currentNumber = "";
            }
        });
        operatorButtons[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                double radio = Double.parseDouble(expression);
                double resultado = calculadora.calcularAreaCirculo(radio);
                display.setText(String.valueOf(resultado));
                currentNumber = "";
            }
        });
        operatorButtons[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = display.getText();
                double base = Double.parseDouble(expression);
                double altura = Double.parseDouble(expression);
                double resultado = calculadora.calcularAreaTriangulo(base, altura);
                display.setText(String.valueOf(resultado));
                currentNumber = "";
            }
        });
        operatorButtons[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ladoText = display.getText();
                double lado = Double.parseDouble(ladoText);
                double resultado = calculadora.calcularAreaCuadrado(lado);
                display.setText(String.valueOf(resultado));
                currentNumber = "";
            }
        });
        operatorButtons[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String baseText = display.getText();
                double base = Double.parseDouble(baseText);
                String alturaText = JOptionPane.showInputDialog("Ingrese la altura del rectángulo:");
                double altura = Double.parseDouble(alturaText);
                double resultado = calculadora.calcularAreaRectangulo(base, altura);
                display.setText(String.valueOf(resultado));
                currentNumber = "";
            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                currentNumber = "";
            }
        });

        pack();
        setVisible(true);
    }

    private JButton createDigitButton(int digit) {
        JButton button = new JButton(String.valueOf(digit));
        button.setFont(new Font("Arial", Font.BOLD, 24));
        return button;
    }

    private JButton createOperatorButton(String operator) {
        JButton button = new JButton(operator);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        return button;
    }

    private double evaluarExpresion(String expression) {
        double resultado = 0;
        String[] partes = expression.split("[+\\-*/]");
        double primerNumero = Double.parseDouble(partes[0]);
        double segundoNumero = Double.parseDouble(partes[1]);
        char operador = expression.charAt(partes[0].length());

        switch (operador) {
            case '+':
                resultado = calculadora.sumar(primerNumero, segundoNumero);
                break;
            case '-':
                resultado = calculadora.restar(primerNumero, segundoNumero);
                break;
            case '*':
                resultado = calculadora.multiplicar(primerNumero, segundoNumero);
                break;
            case '/':
                resultado = calculadora.dividir(primerNumero, segundoNumero);
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Crear una instancia de la calculadora GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI();
            }
        });
    }
}