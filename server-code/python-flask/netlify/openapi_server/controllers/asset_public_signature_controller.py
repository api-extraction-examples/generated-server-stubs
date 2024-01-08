import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.asset_public_signature import AssetPublicSignature  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_site_asset_public_signature(site_id, asset_id):  # noqa: E501
    """get_site_asset_public_signature

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param asset_id: 
    :type asset_id: str

    :rtype: Union[AssetPublicSignature, Tuple[AssetPublicSignature, int], Tuple[AssetPublicSignature, int, Dict[str, str]]
    """
    return 'do some magic!'
