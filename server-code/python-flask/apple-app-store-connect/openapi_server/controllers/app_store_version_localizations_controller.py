import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_preview_sets_response import AppPreviewSetsResponse  # noqa: E501
from openapi_server.models.app_screenshot_sets_response import AppScreenshotSetsResponse  # noqa: E501
from openapi_server.models.app_store_version_localization_create_request import AppStoreVersionLocalizationCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_localization_response import AppStoreVersionLocalizationResponse  # noqa: E501
from openapi_server.models.app_store_version_localization_update_request import AppStoreVersionLocalizationUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_store_version_localizations_app_preview_sets_get_to_many_related(id, filter_preview_type=None, fields_app_store_version_localizations=None, fields_app_previews=None, fields_app_preview_sets=None, limit=None, include=None):  # noqa: E501
    """app_store_version_localizations_app_preview_sets_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param filter_preview_type: filter by attribute &#39;previewType&#39;
    :type filter_preview_type: List[str]
    :param fields_app_store_version_localizations: the fields to include for returned resources of type appStoreVersionLocalizations
    :type fields_app_store_version_localizations: List[str]
    :param fields_app_previews: the fields to include for returned resources of type appPreviews
    :type fields_app_previews: List[str]
    :param fields_app_preview_sets: the fields to include for returned resources of type appPreviewSets
    :type fields_app_preview_sets: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppPreviewSetsResponse, Tuple[AppPreviewSetsResponse, int], Tuple[AppPreviewSetsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_version_localizations_app_screenshot_sets_get_to_many_related(id, filter_screenshot_display_type=None, fields_app_store_version_localizations=None, fields_app_screenshot_sets=None, fields_app_screenshots=None, limit=None, include=None):  # noqa: E501
    """app_store_version_localizations_app_screenshot_sets_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param filter_screenshot_display_type: filter by attribute &#39;screenshotDisplayType&#39;
    :type filter_screenshot_display_type: List[str]
    :param fields_app_store_version_localizations: the fields to include for returned resources of type appStoreVersionLocalizations
    :type fields_app_store_version_localizations: List[str]
    :param fields_app_screenshot_sets: the fields to include for returned resources of type appScreenshotSets
    :type fields_app_screenshot_sets: List[str]
    :param fields_app_screenshots: the fields to include for returned resources of type appScreenshots
    :type fields_app_screenshots: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppScreenshotSetsResponse, Tuple[AppScreenshotSetsResponse, int], Tuple[AppScreenshotSetsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_version_localizations_create_instance(app_store_version_localization_create_request):  # noqa: E501
    """app_store_version_localizations_create_instance

     # noqa: E501

    :param app_store_version_localization_create_request: AppStoreVersionLocalization representation
    :type app_store_version_localization_create_request: dict | bytes

    :rtype: Union[AppStoreVersionLocalizationResponse, Tuple[AppStoreVersionLocalizationResponse, int], Tuple[AppStoreVersionLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_localization_create_request = AppStoreVersionLocalizationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_version_localizations_delete_instance(id):  # noqa: E501
    """app_store_version_localizations_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_version_localizations_get_instance(id, fields_app_store_version_localizations=None, include=None, fields_app_screenshot_sets=None, fields_app_preview_sets=None, limit_app_preview_sets=None, limit_app_screenshot_sets=None):  # noqa: E501
    """app_store_version_localizations_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_version_localizations: the fields to include for returned resources of type appStoreVersionLocalizations
    :type fields_app_store_version_localizations: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_screenshot_sets: the fields to include for returned resources of type appScreenshotSets
    :type fields_app_screenshot_sets: List[str]
    :param fields_app_preview_sets: the fields to include for returned resources of type appPreviewSets
    :type fields_app_preview_sets: List[str]
    :param limit_app_preview_sets: maximum number of related appPreviewSets returned (when they are included)
    :type limit_app_preview_sets: int
    :param limit_app_screenshot_sets: maximum number of related appScreenshotSets returned (when they are included)
    :type limit_app_screenshot_sets: int

    :rtype: Union[AppStoreVersionLocalizationResponse, Tuple[AppStoreVersionLocalizationResponse, int], Tuple[AppStoreVersionLocalizationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_version_localizations_update_instance(id, app_store_version_localization_update_request):  # noqa: E501
    """app_store_version_localizations_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_store_version_localization_update_request: AppStoreVersionLocalization representation
    :type app_store_version_localization_update_request: dict | bytes

    :rtype: Union[AppStoreVersionLocalizationResponse, Tuple[AppStoreVersionLocalizationResponse, int], Tuple[AppStoreVersionLocalizationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_localization_update_request = AppStoreVersionLocalizationUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
