import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.service_instance import ServiceInstance  # noqa: E501
from openapi_server import util


def create_service_instance(site_id, addon, config):  # noqa: E501
    """create_service_instance

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param addon: 
    :type addon: str
    :param config: 
    :type config: 

    :rtype: Union[ServiceInstance, Tuple[ServiceInstance, int], Tuple[ServiceInstance, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_service_instance(site_id, addon, instance_id):  # noqa: E501
    """delete_service_instance

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param addon: 
    :type addon: str
    :param instance_id: 
    :type instance_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_service_instances_for_site(site_id):  # noqa: E501
    """list_service_instances_for_site

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[ServiceInstance], Tuple[List[ServiceInstance], int], Tuple[List[ServiceInstance], int, Dict[str, str]]
    """
    return 'do some magic!'


def show_service_instance(site_id, addon, instance_id):  # noqa: E501
    """show_service_instance

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param addon: 
    :type addon: str
    :param instance_id: 
    :type instance_id: str

    :rtype: Union[ServiceInstance, Tuple[ServiceInstance, int], Tuple[ServiceInstance, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_service_instance(site_id, addon, instance_id, config):  # noqa: E501
    """update_service_instance

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param addon: 
    :type addon: str
    :param instance_id: 
    :type instance_id: str
    :param config: 
    :type config: 

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
