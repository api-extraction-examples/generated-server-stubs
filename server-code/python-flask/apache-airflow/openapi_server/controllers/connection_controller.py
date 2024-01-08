import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.connection import Connection  # noqa: E501
from openapi_server.models.connection_collection import ConnectionCollection  # noqa: E501
from openapi_server.models.connection_test import ConnectionTest  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def delete_connection(connection_id):  # noqa: E501
    """Delete a connection

     # noqa: E501

    :param connection_id: The connection ID.
    :type connection_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_connection(connection_id):  # noqa: E501
    """Get a connection

     # noqa: E501

    :param connection_id: The connection ID.
    :type connection_id: str

    :rtype: Union[Connection, Tuple[Connection, int], Tuple[Connection, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_connections(limit=None, offset=None, order_by=None):  # noqa: E501
    """List connections

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[ConnectionCollection, Tuple[ConnectionCollection, int], Tuple[ConnectionCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_connection(connection_id, connection, update_mask=None):  # noqa: E501
    """Update a connection

     # noqa: E501

    :param connection_id: The connection ID.
    :type connection_id: str
    :param connection: 
    :type connection: dict | bytes
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Union[Connection, Tuple[Connection, int], Tuple[Connection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        connection = Connection.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_connection(connection):  # noqa: E501
    """Create a connection

     # noqa: E501

    :param connection: 
    :type connection: dict | bytes

    :rtype: Union[Connection, Tuple[Connection, int], Tuple[Connection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        connection = Connection.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_connection(connection):  # noqa: E501
    """Test a connection

    Test a connection.  *New in version 2.2.0*  # noqa: E501

    :param connection: 
    :type connection: dict | bytes

    :rtype: Union[ConnectionTest, Tuple[ConnectionTest, int], Tuple[ConnectionTest, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        connection = Connection.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
