import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.import_error import ImportError  # noqa: E501
from openapi_server.models.import_error_collection import ImportErrorCollection  # noqa: E501
from openapi_server import util


def get_import_error(import_error_id):  # noqa: E501
    """Get an import error

     # noqa: E501

    :param import_error_id: The import error ID.
    :type import_error_id: int

    :rtype: Union[ImportError, Tuple[ImportError, int], Tuple[ImportError, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_import_errors(limit=None, offset=None, order_by=None):  # noqa: E501
    """List import errors

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[ImportErrorCollection, Tuple[ImportErrorCollection, int], Tuple[ImportErrorCollection, int, Dict[str, str]]
    """
    return 'do some magic!'
