/**
 * 
 */


function uploadFile() {
	var fd = new FormData();
	fd.append("fileToUpload",
			document.getElementById('fileToUpload').files[0]);
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "/FinalProject1812-1858/upload");
	xhr.send(fd);
}

function btnClicked2(id){
	window.location = "Process.jsp?id="+id;
	
}

function Checkfiles() {

	var fup = document.getElementById('file');
	var fileName = fup.value;
	var ext = fileName.substring(fileName.lastIndexOf('.') + 1);
	if (ext == "doc" || ext == "docx") {
		return true;
	} else {
		alert("Please Upload a Word Document File!!");
		fup.value = null;
		fup.focus("color", "red");
		return false;
	}
}
