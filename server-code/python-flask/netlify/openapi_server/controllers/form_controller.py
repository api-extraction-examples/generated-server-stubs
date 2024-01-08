import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.form import Form  # noqa: E501
from openapi_server import util


def delete_site_form(site_id, form_id):  # noqa: E501
    """delete_site_form

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param form_id: 
    :type form_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_forms(site_id):  # noqa: E501
    """list_site_forms

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[Form], Tuple[List[Form], int], Tuple[List[Form], int, Dict[str, str]]
    """
    return 'do some magic!'
