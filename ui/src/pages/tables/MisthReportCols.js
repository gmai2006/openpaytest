import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'kodcol', header: 'kodcol', defaultFlex: 1 },
  { name: 'kodreport', header: 'kodreport', defaultFlex: 1 },
  { name: 'kodxrisi', header: 'kodxrisi', defaultFlex: 1 },
  { name: 'expr', header: 'expr', defaultFlex: 1 },
  { name: 'headerText', header: 'headerText', defaultFlex: 1 },
  { name: 'width', header: 'width', defaultFlex: 1 },
  { name: 'aa', header: 'aa', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'misthreportcols/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const MisthReportCols = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default MisthReportCols;