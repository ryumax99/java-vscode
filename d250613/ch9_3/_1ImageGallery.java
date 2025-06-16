package d250613.ch9_3;

import java.awt.*;
import java.util.ArrayList;

import java.awt.event.*;

import javax.swing.*;

public class _1ImageGallery extends JFrame {
    //ImageIcon 클래스 생성
    private ArrayList<ImageIcon> images;
    private ArrayList<String> titles;
    private int currentIndex = 0;
    
    private JLabel titleLabel;
    private JLabel imageLabel;
    private JPanel thumbnailPanel;

    //매개변수 생성자를 정의하고, 실행 클래스가 아니면, 해당 클래스의 기능을 동작 시킬 때
    public _1ImageGallery(ArrayList<ImageIcon> images, ArrayList<String> titles) {
        this.images = images;
        this.titles = titles;

        setTitle("이미지 갤러리 예시");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout()); // 기본값, 명시적으로 표기,

        // 이미지 제목 부분, 생성자 밖에, 전역으로 선언만 했었고, 여기서 초기화를 함,
        // 여기에, 우리가 받은 이미지 제목 리스트에서 요소를 꺼내서, 이 라벨에 주입 할 예정.
        titleLabel = new JLabel("", SwingConstants.CENTER);
        // Font 클래스 이용해서, 폰트, 굵기, 크기
        titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        // 프레임의 북쪽 영역에 제목 붙이기
        add(titleLabel, BorderLayout.NORTH);

        // 이미지 라벨
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // 네비게이션, 버튼
        JPanel navPanel = new JPanel(); // 기본 배치 관리자 FlowLayout , 나란히 배치가 됨.
        JButton preBtn = new JButton("이전");
        JButton nextBtn = new JButton("다음");
        navPanel.add(preBtn);
        navPanel.add(nextBtn);
        add(navPanel, BorderLayout.SOUTH);

        // 썸네일 패널
        thumbnailPanel = new JPanel();
        thumbnailPanel.setLayout(new FlowLayout());
        // add(thumbnailPanel, BorderLayout.PAGE_END);
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        southPanel.add(navPanel, BorderLayout.NORTH);
        southPanel.add(thumbnailPanel, BorderLayout.SOUTH);
        add(southPanel, BorderLayout.SOUTH);

        // 버튼에 대해서, 이벤트 리스너 설정, 람다식
        // 현재 인덱스 번호가, 우리가 나타낼 , 이미지의 인덱스 동일,
        preBtn.addActionListener(e -> showImage(currentIndex - 1));
        nextBtn.addActionListener(e -> showImage(currentIndex + 1));

        // 함수를 호출 기능, 1) 썸네일 이미지 호출 기능 , 2) 초기 이미지 호출 기능
        loadThumbnails();
        showImage(0);



        // 위치를 중앙에 배치
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void showImage(int index) {
        if (index <0 || index >= images.size()) 
            return;
        currentIndex = index;
        imageLabel.setIcon(images.get(currentIndex));
        titleLabel.setText(titles.get(currentIndex));
        
    }

    // 썸네일 호출
    private void loadThumbnails() {
        thumbnailPanel.removeAll();

        // 이미지 리스트의 크기만큼 반복
        for(int i = 0; i < images.size(); i++) {
            ImageIcon thumbIcon = new ImageIcon(
                    images.get(i).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
            JLabel thumLabel = new JLabel(thumbIcon);
            int idx = i;
            // 썸네일 라벨에 테두를 추가
            thumLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

            // 마우스에 커서 올리면 손가락 모양으로 변경 하는 기능.
            thumLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // 썸네일 라벨에 마우스 클릭 이벤트 추가. , 메인 이미지를 보기.
            thumLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    showImage(idx);
                }
            });

            // 썸네일 패널에 라벨 추가.
            thumbnailPanel.add(thumLabel);
        }
          // 썸네일 패널의 레이아웃을 다시 계산 기능,
        thumbnailPanel.revalidate();
        // 다시 그리기.
        thumbnailPanel.repaint();
    }



    public static void main(String[] args) {
        // 임시 이미지, 제목을 담을 리스트 만들기.
        ArrayList<ImageIcon> imageList = new ArrayList<>();
        ArrayList<String> titleList = new ArrayList<>();
         // 샘플 이미지를 불러오기. 리스트에 담기
        imageList.add(new ImageIcon("cat1.jpg"));
        imageList.add(new ImageIcon("cat2.jpg"));
        imageList.add(new ImageIcon("cat3.jpg"));
        // 이미지 제목, 문자열 , 리스트에 담기.
        titleList.add("첫 번째 이미지");
        titleList.add("두 번째 이미지");
        titleList.add("세 번째 이미지");
        SwingUtilities.invokeLater(() -> new _1ImageGallery(imageList, titleList));
    }





    
}
