// 삭제 버튼이 눌러졌을 때, 작업이 일어나는 -> class: delete
document.querySelector('.delete').onclick = function() {
    if(!confirm("정말 삭제할까요?")) {
        return;
    }
    document.getElementById('.deleteForm').submit();
}
// deleteForm 아이디를 가진 폼을 찾고, submit 메소드를 통해 제출했다.