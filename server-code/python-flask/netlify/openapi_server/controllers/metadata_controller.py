import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_site_metadata(site_id):  # noqa: E501
    """get_site_metadata

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_site_metadata(site_id, metadata):  # noqa: E501
    """update_site_metadata

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param metadata: 
    :type metadata: 

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
