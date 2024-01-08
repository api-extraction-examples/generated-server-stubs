import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.function import Function  # noqa: E501
from openapi_server import util


def upload_deploy_function(deploy_id, name, file_body, runtime=None, size=None, x_nf_retry_count=None):  # noqa: E501
    """upload_deploy_function

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str
    :param name: 
    :type name: str
    :param file_body: 
    :type file_body: str
    :param runtime: 
    :type runtime: str
    :param size: 
    :type size: int
    :param x_nf_retry_count: 
    :type x_nf_retry_count: int

    :rtype: Union[Function, Tuple[Function, int], Tuple[Function, int, Dict[str, str]]
    """
    return 'do some magic!'
