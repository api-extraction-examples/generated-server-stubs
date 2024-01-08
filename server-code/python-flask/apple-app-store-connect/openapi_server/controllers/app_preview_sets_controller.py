import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_preview_set_app_previews_linkages_request import AppPreviewSetAppPreviewsLinkagesRequest  # noqa: E501
from openapi_server.models.app_preview_set_app_previews_linkages_response import AppPreviewSetAppPreviewsLinkagesResponse  # noqa: E501
from openapi_server.models.app_preview_set_create_request import AppPreviewSetCreateRequest  # noqa: E501
from openapi_server.models.app_preview_set_response import AppPreviewSetResponse  # noqa: E501
from openapi_server.models.app_previews_response import AppPreviewsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_preview_sets_app_previews_get_to_many_related(id, fields_app_previews=None, fields_app_preview_sets=None, limit=None, include=None):  # noqa: E501
    """app_preview_sets_app_previews_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_previews: the fields to include for returned resources of type appPreviews
    :type fields_app_previews: List[str]
    :param fields_app_preview_sets: the fields to include for returned resources of type appPreviewSets
    :type fields_app_preview_sets: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppPreviewsResponse, Tuple[AppPreviewsResponse, int], Tuple[AppPreviewsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_preview_sets_app_previews_get_to_many_relationship(id, limit=None):  # noqa: E501
    """app_preview_sets_app_previews_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppPreviewSetAppPreviewsLinkagesResponse, Tuple[AppPreviewSetAppPreviewsLinkagesResponse, int], Tuple[AppPreviewSetAppPreviewsLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_preview_sets_app_previews_replace_to_many_relationship(id, app_preview_set_app_previews_linkages_request):  # noqa: E501
    """app_preview_sets_app_previews_replace_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_preview_set_app_previews_linkages_request: List of related linkages
    :type app_preview_set_app_previews_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_preview_set_app_previews_linkages_request = AppPreviewSetAppPreviewsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_preview_sets_create_instance(app_preview_set_create_request):  # noqa: E501
    """app_preview_sets_create_instance

     # noqa: E501

    :param app_preview_set_create_request: AppPreviewSet representation
    :type app_preview_set_create_request: dict | bytes

    :rtype: Union[AppPreviewSetResponse, Tuple[AppPreviewSetResponse, int], Tuple[AppPreviewSetResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_preview_set_create_request = AppPreviewSetCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_preview_sets_delete_instance(id):  # noqa: E501
    """app_preview_sets_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_preview_sets_get_instance(id, fields_app_preview_sets=None, include=None, fields_app_previews=None, limit_app_previews=None):  # noqa: E501
    """app_preview_sets_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_preview_sets: the fields to include for returned resources of type appPreviewSets
    :type fields_app_preview_sets: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_previews: the fields to include for returned resources of type appPreviews
    :type fields_app_previews: List[str]
    :param limit_app_previews: maximum number of related appPreviews returned (when they are included)
    :type limit_app_previews: int

    :rtype: Union[AppPreviewSetResponse, Tuple[AppPreviewSetResponse, int], Tuple[AppPreviewSetResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
