function deleteProduct(endpoint) {
    if (confirm("Ban co chac muon xoa?") === true) {
        fetch(endpoint, {
            method: "delete"
        }).then(res => {
            if (res.status === 204)
                location.reload();
            else
                alert(`${res.status}`);
        });
    }
}
