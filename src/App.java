import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.*;
import java.awt.event.ActionListener;

public class App {
	
	public static void main(String[] args) {

	JFrame frame = new JFrame("Fiap Movies");
	JPanel content = new JPanel(new BorderLayout(20,0));

	JPanel image = new JPanel();// Esquerda 1c/1l
	JPanel window = new JPanel(new GridLayout(0,1,0,0)); // Meio 1c/7l
	JPanel selection = new JPanel (new GridLayout(0,1,0,0)); // Direita 1c/5l
	selection.setPreferredSize(new Dimension(130,400));

	// Picture --------------------------------------------------------------------------------
	JLabel poster = new JLabel(new ImageIcon("src/3.jpg"));
	poster.setPreferredSize(new Dimension(300,350) );
	image.add(poster);
	
	
	// Window Panel ---------------------------------------------------------------------------
	
	MyLabel title = new MyLabel("Título");  // Titulo
	MyTextField titleText = new MyTextField();
	window.add(title);
	window.add(titleText);
	
	MyLabel sinopsesynopsis = new MyLabel("Sinopse");  // Sinopse
	window.add(sinopsesynopsis);
	MyTextArea sipopseTex = new MyTextArea();
	window.add(sipopseTex);
	
	MyLabel gender = new MyLabel("Gênero");  // Genero
	window.add(gender);
	
	String[] type_gender = {"Drama", "Comédia","Ação","Aventura","Terror","Documentário"};
	JComboBox<String>  choiseBox = new JComboBox<String>(type_gender);
	window.add(choiseBox);
	
	
	JButton saveButton = new JButton("Salvar");
	JButton cancelButton = new JButton("Cancelar");
	
	JPanel painelBotao = new JPanel();
	painelBotao.add(saveButton);
	painelBotao.add(cancelButton);
	window.add(painelBotao);
	
	// Selection Panel --------------------------------------------------------------------------
	
	MyLabel where = new MyLabel("Onde assistir"); // Onde assistir
	selection.add(where);
	
	List<String> listoptions = List.of("Netflix","Prime Vídeo","Pirate Bay"); 
	MyRadioGroup group = new MyRadioGroup(listoptions);     // fonte do conteudo
	selection.add(group);
	
	JCheckBox watched = new JCheckBox ("Assistido");
	selection.add(watched);  // Assistido

	MyLabel assessment = new MyLabel("Avaliação");  // Avaliação
	selection.add(assessment);
	 
	StarRater score = new StarRater(5);
	selection.add(score);
	
	//-----------------------------------------------------------------------------------------
	
	
	content.add(image, BorderLayout.WEST);
	content.add(window, BorderLayout.CENTER);
	content.add(selection, BorderLayout.EAST);
	
	
	JTabbedPane abas = new JTabbedPane();
	abas.add("Cadastro", content);
	abas.add("Lista", new JPanel());
	frame.add(abas);	
	
	frame.setSize(700,420);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	//____________________________________________________________________
	
	score.addStarListener(new StarRater.StarListener() {
		
		@Override
		public void handleSelection(int selection) {
			score.setRating(selection);
			
		}
	});
	
	
saveButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Movie movie = new Movie( titleText,sipopseTex,group,choiseBox,watched,score);
			movie.printMovie();
			
		}
	});
	

	  }

}