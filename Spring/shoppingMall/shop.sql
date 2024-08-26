DROP TABLE IF EXISTS tbl_shop;
CREATE TABLE tbl_shop
(
    no INTEGER AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(200) NOT NULL,
    brand_name varchar(200) not null,
    category VARCHAR(50) NOT NULL,
    price int not null,
    discount_rate int default 0,
    number_sales INT default 0,
    sex varchar(5) default '전체',
    img varchar(1000) not null
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

INSERT INTO tbl_shop(item_name, brand_name, category, price, discount_rate, number_sales, sex, img)
VALUES
    ("바이오 웨스턴 데님 반팔 셔츠_인디고", "디미트리블랙", "상의", 46900, 36, 5343200, "남자", "https://image.msscdn.net/thumbnails/images/goods_img/20240408/4036295/4036295_17201502151408_big.jpg?w=1200"),
    ("레알 마드리드 24/25 홈 저지 IU5011", "아디다스", "상의", 119000, 0, 4322200, "남자","https://image.msscdn.net/thumbnails/images/goods_img/20240620/4210487/4210487_17188612159305_big.jpg?w=1200"),
    ("(VLAD) 피그먼트 슬래쉬 반팔 티셔츠_차콜", "디미트리블랙", "상의", 40900, 12, 3223091, "남자", "https://image.msscdn.net/thumbnails/images/goods_img/20240415/4055771/4055771_17164413957204_big.png?w=1200"),
    ("오로 어피어 레이스 스웻셔츠_Classic Navy", "오로", "상의", 74000, 20, 234234, "여자","https://image.msscdn.net/thumbnails/images/goods_img/20240807/4303107/4303107_17231286394585_big.jpg?w=1200"),
    ("HUFF Hoppi 피그먼트 반팔티 다크블루","꼼파뇨","상의", 50000, 45, 123121,"여자","https://image.msscdn.net/thumbnails/images/goods_img/20240607/4182642/4182642_17177373646056_big.jpg?w=1200"),
    ("크래그 남성 - BLACK/BLACK / AFOFMX9017", "아크테릭스", "신발", 250000, 0, 12032311, "전체","https://image.msscdn.net/thumbnails/images/goods_img/20240730/4282769/4282769_17240341669980_big.jpg?w=1200"),
    ("토바코 그루엔 - 버건디 / GW8204", "아디다스", "신발", 139000, 0, 123123114, "전체", "https://image.msscdn.net/thumbnails/images/goods_img/20220325/2446606/2446606_1_big.jpg?w=1200"),
    ("캠퍼스 00s - 블랙:화이트 / HQ8708","아디다스","신발",129000, 0, 1239898, "전체","https://image.msscdn.net/thumbnails/images/goods_img/20230329/3188621/3188621_16805010304972_big.jpg?w=1200"),
    ("에어 포스 1 07 M - 화이트 / CW2288-111", "나이키","신발",139000, 0, 12829839, "전체","https://image.msscdn.net/thumbnails/images/goods_img/20240321/3976350/3976350_17115804993997_big.jpg?w=1200"),
    ("캣 브러쉬 워시드 버뮤다 데님 쇼츠 (SAND BLUE)","트릴리온","하의",45000,34,181891,"여자","https://image.msscdn.net/thumbnails/images/goods_img/20240507/4111294/4111294_17153273022925_big.jpg?w=1200"),
    ("Deep One Tuck Sweat Shorts [Grey]", "제로","하의",32000,0, 1293901,"전체","https://image.msscdn.net/thumbnails/images/goods_img/20210428/1926048/1926048_1_big.jpg?w=1200"),
    ("EASY OR EASY BALLOON PANTS (DARK GREY)", "기철","하의",79000,20,1898912,"전체","https://image.msscdn.net/thumbnails/images/goods_img/20240527/4156080/4156080_17167878819038_big.jpg?w=1200"),
    ("COY BACKPACK PURPLE GREY","코이세오","가방",109000,0,129012,"전체","https://image.msscdn.net/thumbnails/images/goods_img/20240817/4339420/4339420_17238830486993_big.png?w=1200"),
    ("Sopy Collar Short-Sleeve BLACK", "어반드레스","상의",45000,34, 1289121,"여자","https://image.msscdn.net/thumbnails/images/goods_img/20230316/3155032/3155032_17198196720060_big.jpg?w=1200"),
    ("GRAINY - 547 (a) VIBRAM","킨치","신발",364000, 15, 300400, "남자","https://image.msscdn.net/thumbnails/images/goods_img/20240318/3964230/3964230_17150680463976_big.jpg?w=1200");


select * from tbl_shop;