import axios from 'axios';

export const downloadFile = async (fileUrl) => {
  try {
    const link = document.createElement('a');
    link.href = fileUrl;

    document.body.appendChild(link);
    link.click(); // click 이벤트 강제 발생
    document.body.removeChild(link); // dom에서 제거
  } catch (error) {
    console.error(error);
  }
};
