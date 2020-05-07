'use strict'
window.addEventListener('load', function() {
    const baseUrl = "http://localhost:8080/";
    document.getElementById("ProductNameId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findProductByName]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findProductByName", settings).then(data => console.log(data)).catch(err => console.log(err))
    })
    document.getElementById("ProductTypeId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findProductByType]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findProductByType", settings).then(data => console.log(data)).catch(err => console.log(err))
    })
    document.getElementById("ProductPriceId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findProductByPrice]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findProductByPrice", settings).then(data => console.log(data)).catch(err => console.log(err))
    })
    document.getElementById("ProductQuantityId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findProductByQuantity]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findProductByQuantity", settings).then(data => console.log(data)).catch(err => console.log(err))
    })
    document.getElementById("StoreNameId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findStoreByName]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findStoreByName", settings).then(data => console.log(data)).catch(err => console.log(err))
    })
    document.getElementById("StoreAddressId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findStoreByAddress]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findStoreByAddress", settings).then(data => console.log(data)).catch(err => console.log(err))
    })
    document.getElementById("StoreDescriptionId").addEventListener('click', function () {
        const findProductByName = document.querySelector('[name=findStoreByDescription]');
        const body = new FormData(findProductByName);
        const settings = {
            method: 'POST',
            body: body
        }
        fetch(baseUrl + "findStoreByDescription", settings).then(data => console.log(data)).catch(err => console.log(err))
    })

})
