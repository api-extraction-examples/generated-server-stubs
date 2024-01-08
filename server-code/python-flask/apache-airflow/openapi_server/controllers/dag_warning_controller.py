import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.dag_warning_collection import DagWarningCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_dag_warnings(dag_id=None, warning_type=None, limit=None, offset=None, order_by=None):  # noqa: E501
    """List dag warnings

     # noqa: E501

    :param dag_id: If set, only return DAG warnings with this dag_id.
    :type dag_id: str
    :param warning_type: If set, only return DAG warnings with this type.
    :type warning_type: str
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[DagWarningCollection, Tuple[DagWarningCollection, int], Tuple[DagWarningCollection, int, Dict[str, str]]
    """
    return 'do some magic!'
