import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_preview_create_request import AppPreviewCreateRequest  # noqa: E501
from openapi_server.models.app_preview_response import AppPreviewResponse  # noqa: E501
from openapi_server.models.app_preview_update_request import AppPreviewUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_previews_create_instance(app_preview_create_request):  # noqa: E501
    """app_previews_create_instance

     # noqa: E501

    :param app_preview_create_request: AppPreview representation
    :type app_preview_create_request: dict | bytes

    :rtype: Union[AppPreviewResponse, Tuple[AppPreviewResponse, int], Tuple[AppPreviewResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_preview_create_request = AppPreviewCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_previews_delete_instance(id):  # noqa: E501
    """app_previews_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_previews_get_instance(id, fields_app_previews=None, include=None):  # noqa: E501
    """app_previews_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_previews: the fields to include for returned resources of type appPreviews
    :type fields_app_previews: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppPreviewResponse, Tuple[AppPreviewResponse, int], Tuple[AppPreviewResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_previews_update_instance(id, app_preview_update_request):  # noqa: E501
    """app_previews_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_preview_update_request: AppPreview representation
    :type app_preview_update_request: dict | bytes

    :rtype: Union[AppPreviewResponse, Tuple[AppPreviewResponse, int], Tuple[AppPreviewResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_preview_update_request = AppPreviewUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
