package im.chap17.sec02.exam03_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();							//Parent ���� ��ü�� VBox ����
		root.setPrefWidth(350);							//VBox�� �� ����
		root.setPrefHeight(150);							//VBox�� ���� ����
		root.setAlignment(Pos.CENTER);					//��Ʈ���� �߾����� ����
		root.setSpacing(20);								//��Ʈ���� ���� ����

		Label label = new Label();						//Label ��Ʈ�� ����
		label.setText("Hello, JavaFX");						//text �Ӽ� ����
		label.setFont(new Font(50));						//font �Ӽ� ����
		
		Button button = new Button();					//Button ��Ʈ�� ����
		button.setText("Ȯ��");								//text �Ӽ� ����
		button.setOnAction(event->Platform.exit());	//Ŭ�� �̺�Ʈ ó��
		
		root.getChildren().add(label);						//VBox�� Label ��Ʈ�� �߰�
		root.getChildren().add(button);					//VBox�� Button ��Ʈ�� �߰�
		
		Scene scene = new Scene(root);				//VBox�� ��Ʈ �����̳ʷ� �ؼ� Scene ����
		
		primaryStage.setTitle("AppMain");				//�������� ���� ����
		primaryStage.setScene(scene);					//�����쿡 ��� ����
		primaryStage.show();								//������ �����ֱ�	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
