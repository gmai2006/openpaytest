import React, {useState,useEffect} from 'react'
import {
  CButton,
  CCard,
  CCardBody,
  CCardHeader,
  CCol,
  CForm,
  CFormInput,
  CFormLabel,
  CFormTextarea,
  CRow,
} from '@coreui/react'

const FormControl = () => {
  const [data,setData]=useState([]);
  const getData=()=>{
    fetch('data.json'
    ,{
      headers : { 
        'Content-Type': 'application/json',
        'Accept': 'application/json'
       }
    }
    )
      .then(function(response){
        console.log(response)
        return response.json();
      })
      .then(function(myJson) {
        console.log(myJson);
        setData(myJson)
      });
  }
  useEffect(()=>{
    getData()
  },[])
  return (
    <CCol xs={12}>
        <CCard className="mb-4">
          <CCardHeader>
            <strong>Form</strong> <small>Edit JSON Values</small>
            
          </CCardHeader>
          <CCardBody>
            <CFormInput type="text" size="lg" placeholder="id" aria-label="lg input example"/>
            <CFormInput type="text" size="lg" placeholder="name" aria-label="default input example"/>
            <CFormInput type="text" size="lg" placeholder="price" aria-label="sm input example"/>
          </CCardBody>
        </CCard>
      </CCol>
  )
}

export default FormControl
