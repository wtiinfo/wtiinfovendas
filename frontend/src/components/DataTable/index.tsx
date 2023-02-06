const DataTable = () => {
    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>22/04/2021</td>
                        <td>Barry Allen</td>
                        <td>34</td>
                        <td>25</td>
                        <td>15017.00</td>
                    </tr>
                    <tr>
                        <td>12/05/2021</td>
                        <td>Padme</td>
                        <td>33</td>
                        <td>21</td>
                        <td>11044.00</td>
                    </tr>
                    <tr>
                        <td>19/12/2021</td>
                        <td>Bruce</td>
                        <td>21</td>
                        <td>12</td>
                        <td>5033.04</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;