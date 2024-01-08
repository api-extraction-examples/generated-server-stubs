import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.build_log_msg import BuildLogMsg  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def update_site_build_log(build_id, msg):  # noqa: E501
    """update_site_build_log

     # noqa: E501

    :param build_id: 
    :type build_id: str
    :param msg: 
    :type msg: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        msg = BuildLogMsg.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
