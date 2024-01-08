import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.deploy import Deploy  # noqa: E501
from openapi_server.models.deploy_files import DeployFiles  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def cancel_site_deploy(deploy_id):  # noqa: E501
    """cancel_site_deploy

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_site_deploy(site_id, deploy, deploy_previews=None, production=None, state=None, branch=None, latest_published=None, title=None):  # noqa: E501
    """create_site_deploy

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param deploy: 
    :type deploy: dict | bytes
    :param deploy_previews: 
    :type deploy_previews: bool
    :param production: 
    :type production: bool
    :param state: 
    :type state: str
    :param branch: 
    :type branch: str
    :param latest_published: 
    :type latest_published: bool
    :param title: 
    :type title: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        deploy = DeployFiles.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_deploy(deploy_id):  # noqa: E501
    """delete_deploy

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_site_deploy(deploy_id, site_id):  # noqa: E501
    """delete_site_deploy

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str
    :param site_id: 
    :type site_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_deploy(deploy_id):  # noqa: E501
    """get_deploy

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_site_deploy(site_id, deploy_id):  # noqa: E501
    """get_site_deploy

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_deploys(site_id, deploy_previews=None, production=None, state=None, branch=None, latest_published=None, page=None, per_page=None):  # noqa: E501
    """list_site_deploys

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param deploy_previews: 
    :type deploy_previews: bool
    :param production: 
    :type production: bool
    :param state: 
    :type state: str
    :param branch: 
    :type branch: str
    :param latest_published: 
    :type latest_published: bool
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Deploy], Tuple[List[Deploy], int], Tuple[List[Deploy], int, Dict[str, str]]
    """
    return 'do some magic!'


def lock_deploy(deploy_id):  # noqa: E501
    """lock_deploy

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    return 'do some magic!'


def restore_site_deploy(site_id, deploy_id):  # noqa: E501
    """restore_site_deploy

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    return 'do some magic!'


def rollback_site_deploy(site_id):  # noqa: E501
    """rollback_site_deploy

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def unlock_deploy(deploy_id):  # noqa: E501
    """unlock_deploy

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_site_deploy(site_id, deploy_id, deploy):  # noqa: E501
    """update_site_deploy

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param deploy_id: 
    :type deploy_id: str
    :param deploy: 
    :type deploy: dict | bytes

    :rtype: Union[Deploy, Tuple[Deploy, int], Tuple[Deploy, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        deploy = DeployFiles.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
