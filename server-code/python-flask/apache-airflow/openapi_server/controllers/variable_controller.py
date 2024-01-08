import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.variable import Variable  # noqa: E501
from openapi_server.models.variable_collection import VariableCollection  # noqa: E501
from openapi_server import util


def delete_variable(variable_key):  # noqa: E501
    """Delete a variable

     # noqa: E501

    :param variable_key: The variable Key.
    :type variable_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_variable(variable_key):  # noqa: E501
    """Get a variable

    Get a variable by key. # noqa: E501

    :param variable_key: The variable Key.
    :type variable_key: str

    :rtype: Union[Variable, Tuple[Variable, int], Tuple[Variable, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_variables(limit=None, offset=None, order_by=None):  # noqa: E501
    """List variables

    The collection does not contain data. To get data, you must get a single entity. # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[VariableCollection, Tuple[VariableCollection, int], Tuple[VariableCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_variable(variable_key, variable, update_mask=None):  # noqa: E501
    """Update a variable

    Update a variable by key. # noqa: E501

    :param variable_key: The variable Key.
    :type variable_key: str
    :param variable: 
    :type variable: dict | bytes
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Union[Variable, Tuple[Variable, int], Tuple[Variable, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        variable = Variable.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_variables(variable):  # noqa: E501
    """Create a variable

     # noqa: E501

    :param variable: 
    :type variable: dict | bytes

    :rtype: Union[Variable, Tuple[Variable, int], Tuple[Variable, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        variable = Variable.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
