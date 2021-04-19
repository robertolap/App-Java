import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Movie {

	public MyTextField titleText;
	public MyTextArea sipopseTex;
	public MyRadioGroup group;
	public JComboBox  choiseBox;
	public JCheckBox watched;
	public StarRater score;
	
	public Movie(MyTextField titleText,MyTextArea sipopseTex,MyRadioGroup group,JComboBox  choiseBox,JCheckBox watched,StarRater score) {
			this.titleText=titleText;
			this.sipopseTex = sipopseTex;
			this.group =group;
			this.choiseBox = choiseBox;
			this.watched =watched;
			this.score = score;
	}
	
	
	
	public MyTextField getTitleText() {
		return titleText;
	}



	public void setTitleText(MyTextField titleText) {
		this.titleText = titleText;
	}



	public MyTextArea getSipopseTex() {
		return sipopseTex;
	}



	public void setSipopseTex(MyTextArea sipopseTex) {
		this.sipopseTex = sipopseTex;
	}



	public MyRadioGroup getGroup() {
		return group;
	}



	public void setGroup(MyRadioGroup group) {
		this.group = group;
	}



	public JComboBox getChoiseBox() {
		return choiseBox;
	}



	public void setChoiseBox(JComboBox choiseBox) {
		this.choiseBox = choiseBox;
	}



	public JCheckBox getWatched() {
		return watched;
	}



	public void setWatched(JCheckBox watched) {
		this.watched = watched;
	}



	public StarRater getScore() {
		return score;
	}



	public void setScore(StarRater score) {
		this.score = score;
	}



	public void printMovie() {
		System.out.println("Título: "+titleText.getText());
		System.out.println("Sinopse: "+sipopseTex.getText());
		System.out.println("Disponível: "+ group.getValueradio());
		System.out.println("Gênero: "+choiseBox.getSelectedItem());
		System.out.println("Assistido: "+ watched.isSelected());
		System.out.println("Avaliação:  "+ score.getRating());
			
			}
	}


