import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.asset import Asset  # noqa: E501
from openapi_server.models.asset_signature import AssetSignature  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def create_site_asset(site_id, name, size, content_type, visibility=None):  # noqa: E501
    """create_site_asset

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param name: 
    :type name: str
    :param size: 
    :type size: int
    :param content_type: 
    :type content_type: str
    :param visibility: 
    :type visibility: str

    :rtype: Union[AssetSignature, Tuple[AssetSignature, int], Tuple[AssetSignature, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_site_asset(site_id, asset_id):  # noqa: E501
    """delete_site_asset

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param asset_id: 
    :type asset_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_site_asset_info(site_id, asset_id):  # noqa: E501
    """get_site_asset_info

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param asset_id: 
    :type asset_id: str

    :rtype: Union[Asset, Tuple[Asset, int], Tuple[Asset, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_assets(site_id):  # noqa: E501
    """list_site_assets

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[Asset], Tuple[List[Asset], int], Tuple[List[Asset], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_site_asset(site_id, asset_id, state):  # noqa: E501
    """update_site_asset

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param asset_id: 
    :type asset_id: str
    :param state: 
    :type state: str

    :rtype: Union[Asset, Tuple[Asset, int], Tuple[Asset, int, Dict[str, str]]
    """
    return 'do some magic!'
