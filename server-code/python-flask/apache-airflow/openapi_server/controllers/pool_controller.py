import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.pool import Pool  # noqa: E501
from openapi_server.models.pool_collection import PoolCollection  # noqa: E501
from openapi_server import util


def delete_pool(pool_name):  # noqa: E501
    """Delete a pool

     # noqa: E501

    :param pool_name: The pool name.
    :type pool_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_pool(pool_name):  # noqa: E501
    """Get a pool

     # noqa: E501

    :param pool_name: The pool name.
    :type pool_name: str

    :rtype: Union[Pool, Tuple[Pool, int], Tuple[Pool, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_pools(limit=None, offset=None, order_by=None):  # noqa: E501
    """List pools

     # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[PoolCollection, Tuple[PoolCollection, int], Tuple[PoolCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_pool(pool_name, pool, update_mask=None):  # noqa: E501
    """Update a pool

     # noqa: E501

    :param pool_name: The pool name.
    :type pool_name: str
    :param pool: 
    :type pool: dict | bytes
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Union[Pool, Tuple[Pool, int], Tuple[Pool, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        pool = Pool.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_pool(pool):  # noqa: E501
    """Create a pool

     # noqa: E501

    :param pool: 
    :type pool: dict | bytes

    :rtype: Union[Pool, Tuple[Pool, int], Tuple[Pool, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        pool = Pool.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
