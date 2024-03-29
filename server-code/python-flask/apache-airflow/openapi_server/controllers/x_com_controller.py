import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.x_com import XCom  # noqa: E501
from openapi_server.models.x_com_collection import XComCollection  # noqa: E501
from openapi_server import util


def get_xcom_entries(dag_id, dag_run_id, task_id, limit=None, offset=None):  # noqa: E501
    """List XCom entries

    This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG runs and task instances. XCom values won&#39;t be returned as they can be large. Use this endpoint to get a list of XCom entries and then fetch individual entry to get value. # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: Union[XComCollection, Tuple[XComCollection, int], Tuple[XComCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_xcom_entry(dag_id, dag_run_id, task_id, xcom_key, deserialize=None):  # noqa: E501
    """Get an XCom entry

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param xcom_key: The XCom key.
    :type xcom_key: str
    :param deserialize: Whether to deserialize an XCom value when using a custom XCom backend.  The XCom API endpoint calls &#x60;orm_deserialize_value&#x60; by default since an XCom may contain value that is potentially expensive to deserialize in the web server. Setting this to true overrides the consideration, and calls &#x60;deserialize_value&#x60; instead.  This parameter is not meaningful when using the default XCom backend.  *New in version 2.4.0* 
    :type deserialize: bool

    :rtype: Union[XCom, Tuple[XCom, int], Tuple[XCom, int, Dict[str, str]]
    """
    return 'do some magic!'
