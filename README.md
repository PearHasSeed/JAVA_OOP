# Git là gì?
Git Là một Distributed Version Control System (hệ thống quản lý phiên bản phân tán) miễn phí và có mã nguồn mở (open source).
 Được phát triển bởi Linus Torvalds - người sáng tạo ra hệ điều hành Linux vào năm 2005 và dẫn trở thành một version control system phổ biến nhất. Trong một khảo sát thực hiện về version control được các lập trình viên sử dung trên Stack Overflow năm 2018 Git nhận được tới 88.4% trong tổng số 74,298 lượt phản hồi
 
![What are developers using for source control](https://user-images.githubusercontent.com/120564168/211192948-5b750b34-b439-4502-80be-17ad565e16ce.png)

![Primary Code Management](https://user-images.githubusercontent.com/120564168/211192965-169a02d7-d848-4a23-830e-aab245608e2f.png)


## Lợi ích của Git
Một lý do hiển nhiên các lập trình viên hiện nay chọn Git vì đơn giản nó đã trở nên quá phổ biến, tuy nhiên hãy tìm hiểu lý do đằng sau sự phổ biến đó:
1. Nhanh, nhẹ: Đây là một ưu tiên hàng đầu của Git ngay từ lúc phát triển. Trong đa số các tác vụ Git xử lý nhanh hơn so với Subversion (SVN). Repository trong Git cũng gọn nhẹ hơn so với đa số các VCS khác.
2. Staging Area: Đây một vùng trung gian để lưu những thay đổi trước khi quyết định commit và là một đặc trưng của Git.
3. Phân tán: Git repository được chứa đồng thời trên server (remote repository) và cục bộ (local repository) trên máy của mỗi lập trình viên. Điều này nghĩa là lập trình viên có thể thao tác Git trên các tập tin offline và chỉ cần kết nối với server khi muốn push code lên remote repository. Điều này còn giúp đẩy nhanh tốc độ thao tác trong Git.
4. Bảo mật:  Git mã hóa các nội dung trong file sử dụng mã SHA1 và sử dụng những reference chứa những mã đó. Điều này đảm bảo tính bảo mật cho code và cho phép truy xuất lịch sử thay đổi và phục hồi chúng.
5. Branching model: Branch model trong Git hoạt động dựa trên cơ chế "reference", điều này giúp việc tạo, truy xuất và thực hiện thay đổi trên branch diễn ra dễ dàng, nhanh chóng.

## Sử dụng git
Verify xem Git đã được cài đặt hay chưa bằng cách sử dụng lệnh sau trong command prompt.

	git --version
  
Tạo kho lưu trữ Git cục bộ
Trong máy tính, hãy tạo một thư mục cho dự án, lấy ví dụ thư mục dự án là simple-git-demo.
Sau đó, vào thư mục dự án và add thêm kho lưu trữ Git cục bộ bằng cách sử dụng command sau đây:

	cd simple-git-demo
	git init
  
Lệnh git init sẽ thêm kho lưu trữ Git cục bộ vào dự án.

## Thêm source code
Tiếp theo, hãy thêm một đoạn source code nhỏ nhé. Ví dụ ở đây, tôi tạo 1 file tên là demo.txt trong thư mục dự án và thêm text sau đây vào file.

	Initial Content
  
## Staging and Committing
Commit là quá trình trong đó source code được thêm vào kho lưu trữ cục bộ. Trước khi commit, source code phải nằm trong khu vực được chuẩn bị cho quá trình commit.
Khu vực này theo dõi tất cả các files sẽ được commit, file không được thêm vào khu vực này sẽ không được commit - Điều này cho phép các developer kiểm soát được những tệp file cần commit.
## Staging
Sử dụng câu lệnh sau để sắp xếp file vào khu vực chuẩn bị cho quá trình commit.

	git add demo.txt
  
Trường hợp muốn thêm nhiều file, có thể sử dụng câu lệnh sau đây.

	git add file1 file2 file3
  
Ngoài ra, nếu muốn thêm toàn bộ file trong thư mục dự án vào khu vực Staging này, hãy sử dụng command sau.

	git add .

Cần lưu ý khi sử dụng command này, bởi vì nó sẽ thêm toàn bộ các file, folder trong dự án của bạn vào khu vực Staging.
## Committing
Sử dụng câu lệnh sau để commit file.

	git commit -m "Initial Commit"

“Initial Commit” ở đây là message, bạn có thể nhập một message tương ứng để biết được thay đổi source code nào đã được thực hiện trong một commit nào đó.
Git Status and Git Log
Bây giờ, hãy sửa đổi tệp demo.txt và thêm đoạn mã sau:

	Initial Content Adding more Content

## Status
Sử dụng git status để biết được tệp nào đã được sửa đổi, tệp nào nằm trong khu vực được chuẩn bị cho quá trình commit - ngoài ra còn nhiều thông tin khác nữa mà tôi sẽ bỏ qua trong bài viết này.
Sử dụng câu lệnh sau để xem trạng thái:

	git status
  
Trạng thái cho thấy demo.txt đã được sửa đổi và chưa nằm trong khu vực được chuẩn bị cho quá trình commit.
Bây giờ, chúng ta hãy thêm demo.txt vào khu vực Staging và thực hiện commit bằng cách sử dụng câu lệnh sau:

	git add demo.txt git commit -m "demo.txt file is modified"

## Log
Sử dụng git log để show ra tất cả các commit đã được thực hiện cho đến hiện tại bằng command sau.

	git log

Trong đó, tác giả của mỗi commit, datetime của commit, message của commit cũng sẽ được hiển thị.



# Github là gì?
1. Là dịch vụ quản lý dự án và các phiên bản code, nó hoạt động như một nền tảng mạng xã hội dành riêng cho các lập trình viên. Github cho phép các nhà phát triển hợp tác với nhau để thực hiện các thay đổi, lên kế hoạch, quản lý và làm chung các dự án.
2. Là một dịch vụ nổi tiếng cung cấp kho lưu trữ mã nguồn Git cho các dự án phần mềm. Github có đầy đủ những tính năng của Git, ngoài ra nó còn bổ sung những tính năng về social để các developer tương tác với nhau.

## Tính năng của github
### Tính năng chính
- Wiki, issue, thống kê, đổi tên project, project được đặt vào namespace là user.
- Watch project: theo dõi hoạt động của project của người khác. Xem quá trình người ta phát triển phần mềm thế nào, project phát triển ra sao.
- Follow user: theo dõi hoạt động của người khác.
Tiếp cận Github
- Tạo project của riêng mình Contribute cho project có sẵn.
- Fork project có sẵn của người khác, sửa đổi, sau đó đề nghị họ cập nhật sửa đổi của mình (tạo pull request).

## Lợi ích của Github
### Quản lý source code dễ dàng
Khi tạo một repo, toàn bộ source code của repo đó được lưu trên GitHub. Tại đây, ta có thể coi lại quá trình mình đã làm việc thông qua các comment sau mỗi lần commit. Và cái hay ở đây, là nhiều người có thể cùng làm một repo.
### Tracking sự thay đổi qua các version
Khi có nhiều member cùng thực hiện một dự án thì khá là phức tạp để theo dõi revisions – ai thay đổi cái gì, lúc nào và mấy cái file đó được stored ở đâu bằng cách luôn lưu lại những thay đổi bạn đã push lên repository. Cũng tương tự với Microsoft Word hay Google Drive, ta có một lịch sử phiên bản để phòng trường hợp các phiên bản trước đó bị mất hay không được lưu.
### Markdown
Markdown là một cách định dạng text trên web. Ta có thể chỉnh sửa cách hiển thị của document, format từ như định dạng in đậm hay in nghiêng, thêm hình và tạo list những thứ ta có thể làm với Markdown. Hầu hết, Markdown chỉ là đoạn text đơn thuần với những ký tự đặc biệt chèn vào, như # hay *.
### Github giúp cải thiện kỹ năng code
Với hàng vạn open source projects, hàng trăm ngàn contributors, hàng tỉ commit mỗi ngày thì chỉ bằng việc xem, so sánh, học tập từ những thay đổi đó đã đem lại cho ta hàng tá điều hay để cải thiện kỹ năng code của bản thân mình.

## Sử dụng Github
### Tạo một repository
![What do you want to do first](https://user-images.githubusercontent.com/120564168/211193091-a94ae83f-2342-4887-b5e8-4abd993ab6ad.png)


### Tạo một branch
![iuQ3ZgMR6t50z6USW8w5MVBmmWHjlqmf9H00HSMcYkx2sriLSvMubqzSAV3FLwKwgACJyWFMP67LfdqBMbzhLo6xtA_lI6LQ5zC3nxjIEc8UEcGyOxnXQs8_IS40](https://user-images.githubusercontent.com/120564168/211193100-e859193c-1514-49ac-bf17-90a4c05b15bc.png)


### Fork một repository
* Fork một repository (forking a repository) có nghĩa là ta tạo một dự án mới dựa trên dự án cũ. Tức là, sao chép hoàn toàn một repository đã tồn tại, tạo ra các thay đổi cần thiết, và lưu phiên bản mới này dưới dạng một repository độc lập hoàn toàn mới và gọi nó là dự án của riêng ta.
* Tính năng này vô cùng tiện lợi để đẩy nhanh tiến độ dự án. Vì là một dự án hoàn toàn mới, repository chính sẽ không bị ảnh hưởng. Nếu repository master được cập nhật, ta cũng có thể áp dụng các cập nhật đó lên bản fork của ta.
### Pull request
Để thông báo cho những người làm cùng team về những thay đổi ta làm trên dự án, ta sẽ cần tạo Pull Request. Việc này sẽ giúp việc làm việc nhóm trở nên dễ dàng hơn. Pull Request là cách ta để đồng nghiệp biết các thay đổi và đánh giá chúng. Nếu những người khác trong team đồng ý về các thay đổi này, họ sẽ thực hiện merge pull request, đưa những thay đổi này vào dự án ở nhánh chính.


# Gitlab là gì?
1. Là một phần mềm có nhiệm vụ quản lý kho code Git. Sở hữu các tính năng đơn giản, góp phần to lớn trong việc giúp các doanh nghiệp, cá nhân, tổ chức lưu trữ code một cách nhanh chóng vô cùng, người dùng hoàn toàn có thể truy cập mọi lúc mọi nơi miễn là có kết nối Internet.
2. Có thể ẩn kho code của mình, không công khai chúng cho bất kỳ ai, trong trường hợp vượt quá ngưỡng miễn phí thì ta mới phải mất phí để mua thêm dịch vụ.

## Tại sao nên dùng gitlab?
### Sử dụng Gitlab mang đến cho lập trình viên:
1. Sự tiện lợi. Thao tác mỗi khi cần lưu trữ, tải lên, tải xuống code dễ dàng hơn.
2. Kiểm soát các thay đổi trong code nhanh chóng, chính xác.
3. Dễ dàng quản lý, phân phối công việc, hoàn thành dự án lập trình chất lượng hơn.

## Các đặc điểm nổi bật của Gitlab
### Các phiên bản của gitlab:
GitLab có 3 phiên bản bao gồm:
* Gitlab community edition (CE): còn được biết đến là Gitlab phiên bản cộng đồng. Đây là phiên bản mã nguồn mở. Được cung cấp qua Git từ kho lưu trữ chứa Gitlab. Phiên bản mới nhất của Gitlab được các nhà phát triển release tại các nhánh stable và nhánh master.
* Gitlab enterprise edition (EE): còn được biết đến là Gitlab phiên bản doanh nghiệp. Đây là phiên bản có sẵn không lâu sau khi phát hành bản CE, được cung cấp từ kho lưu trữ của gitlab.com. Một doanh nghiệp đăng ký GitLab được sự support của GitLab BV những khó khăn khi cài đặt.
* Gitlab continuous integration (CI). Đây là một giải pháp tích hợp được thực hiện bởi nhóm phát triển Gitlab.

### Protected branches:
Protected branches sẽ cho phép người dùng có thể:
* Đọc hoặc ghi vào repository và các branches.
* Commit và pushing code (đối với một số đối tượng nhất định)
Thông thường, một protected branch gồm 3 chức năng chặn:
* Push từ tất cả mọi người (trừ user và master).
* Push code lên branch từ những người không có quyền truy cập.
* Bất kỳ ai thực hiện xóa branch.
Master branch được mặc định là protected branch. User cần được cấp ít nhất một quyền từ master branch để bảo mật branch. Đây là một chức năng cực kỳ hữu ích để các nhà phát triển có thể bảo vệ được thành quả lao động của mình.

### Tầng vật lý:
* Kho lưu trữ: là nơi xử lý các dự án trên GitLab, các dự án hoặc sản phẩm có thể được lưu tại warehouse.
* Nginx có cách thức hoạt động giống như front-desk, người dùng đến Nginx và yêu cầu hành động được thực hiện bởi worker trong văn phòng.
* Cơ sở dữ liệu là các file của các metal file cabinets chứa các thông tin: sản phẩm trong warehouse, người sử dụng đến front-desk (permissions), Redis, Sidekiq, A Unicorn worker, ….
* GitLab-shell: thực hiện nhiệm vụ tạo các đơn đặt hàng từ một máy fax (SSH) thay vì front-desk (HTTP).
* GitLab enterprise edition là tập hợp các quy trình và hoạt động kinh doanh được điều hành bởi office.
* 
### System layout:
Ứng dụng GitLab-shell được cài đặt tại thư mục: /home/git/gitlab-shell cho phép sử dụng kho dữ liệu qua SSH.

## Lợi ích của Gitlab
### Gitlab là open core:
Đây là một ưu thế cạnh tranh dành cho GitLab khi các đối thủ của phần mềm này chủ yếu là các closed-source. GitLab Community Edition là mã nguồn mở hoàn chỉnh và phiên bản Enterprise Edition là opencore (độc quyền).
### Truy cập vào mã nguồn:
Điểm vượt trội của Open core là bạn có thể xem và sửa đổi source code của GitLab Community Edition và Enterprise Edition khi nào bạn muốn. Điều này không thể thực hiện đối với phần mềm closed-source. Có thể là trên Server hoặc bằng cách giả lập kho lưu trữ của GitLab, bạn có thể thêm các tính năng và thực hiện các tùy chỉnh. GitLab khuyên bạn nên cố gắng hợp nhất các thay đổi trở lại source code chính để những người khác có thể hưởng lợi từ những thay đổi và những thay đổi này vẫn để duy trì và cập nhật.
### Tính khả thi lâu dài:
Chính vì sự uy tín của GitLab, nên đã tạo ra một cộng đồng vững chắc với hàng trăm nghìn tổ chức, cá nhân sử dụng và đóng góp cho phần mềm. Việc có nhiều người cùng xây dựng giúp GitLab có khả năng sử dụng lâu dài hơn vì sẽ không đáng tin cậy nếu chỉ có duy nhất một công ty hỗ trợ cho phần mềm.
### Cộng đồng phát triển:
Bởi những ý kiến đóng góp, xây dựng cùng sự phản hồi tích của của người dùng, Gitlab đang ngày một xây dựng những phiên bản tốt nhất từ ý kiến của các khách hàng để đem đến cho họ những trải nghiệm tuyệt vời nhất. Điều này góp phần tạo nên các tính năng mà các tổ chức thực sự cần, chẳng hạn như quản lý người dùng thật dễ dàng nhưng không hề kém phần mạnh mẽ.
### Phiên bản ổn định mới mỗi tháng:
GitLab phát hành phiên bản ổn định mới mỗi tháng, đầy đủ các cải tiến, tính năng và bản sửa lỗi. Điều này khiến cho GitLab phát triển rất nhanh và luôn đáp ứng yêu cầu của khách hàng theo cách cực kỳ nhanh chóng.
