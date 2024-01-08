import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.deployed_branch import DeployedBranch  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def list_site_deployed_branches(site_id):  # noqa: E501
    """list_site_deployed_branches

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[DeployedBranch], Tuple[List[DeployedBranch], int], Tuple[List[DeployedBranch], int, Dict[str, str]]
    """
    return 'do some magic!'
