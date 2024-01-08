import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def query(sql, shape):  # noqa: E501
    """Execute a SQLite SQL query against the content database

    Accepts SQLite SQL query, returns JSON. Does not allow PRAGMA statements. # noqa: E501

    :param sql: The SQL query to be executed
    :type sql: str
    :param shape: The shape of the response data. Must be \&quot;array\&quot;
    :type shape: str

    :rtype: Union[List[object], Tuple[List[object], int], Tuple[List[object], int, Dict[str, str]]
    """
    return 'do some magic!'
