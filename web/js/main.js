$(document).ready(function() {


$('#confirm-delete').on('show.bs.modal', function(e) {
  var deleteid = $(e.relatedTarget).data('delete');
  $('#delBtn').attr('onClick', "location.href='FuncionarioServlet?action=excluirCategoria&id="+deleteid+"'");
});

const btn = document.getElementById('closeX');
const modal = document.getElementById('MyModal');

btn.addEventListener('click', () => {
  // 👇️ hide button
  modal.style.display = 'none';

});

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
};

});