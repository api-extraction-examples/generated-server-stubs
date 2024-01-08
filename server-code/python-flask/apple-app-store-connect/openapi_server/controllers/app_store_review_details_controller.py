import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_store_review_attachments_response import AppStoreReviewAttachmentsResponse  # noqa: E501
from openapi_server.models.app_store_review_detail_create_request import AppStoreReviewDetailCreateRequest  # noqa: E501
from openapi_server.models.app_store_review_detail_response import AppStoreReviewDetailResponse  # noqa: E501
from openapi_server.models.app_store_review_detail_update_request import AppStoreReviewDetailUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_store_review_details_app_store_review_attachments_get_to_many_related(id, fields_app_store_review_details=None, fields_app_store_review_attachments=None, limit=None, include=None):  # noqa: E501
    """app_store_review_details_app_store_review_attachments_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_review_details: the fields to include for returned resources of type appStoreReviewDetails
    :type fields_app_store_review_details: List[str]
    :param fields_app_store_review_attachments: the fields to include for returned resources of type appStoreReviewAttachments
    :type fields_app_store_review_attachments: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppStoreReviewAttachmentsResponse, Tuple[AppStoreReviewAttachmentsResponse, int], Tuple[AppStoreReviewAttachmentsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_review_details_create_instance(app_store_review_detail_create_request):  # noqa: E501
    """app_store_review_details_create_instance

     # noqa: E501

    :param app_store_review_detail_create_request: AppStoreReviewDetail representation
    :type app_store_review_detail_create_request: dict | bytes

    :rtype: Union[AppStoreReviewDetailResponse, Tuple[AppStoreReviewDetailResponse, int], Tuple[AppStoreReviewDetailResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_review_detail_create_request = AppStoreReviewDetailCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_review_details_get_instance(id, fields_app_store_review_details=None, include=None, fields_app_store_review_attachments=None, limit_app_store_review_attachments=None):  # noqa: E501
    """app_store_review_details_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_review_details: the fields to include for returned resources of type appStoreReviewDetails
    :type fields_app_store_review_details: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_store_review_attachments: the fields to include for returned resources of type appStoreReviewAttachments
    :type fields_app_store_review_attachments: List[str]
    :param limit_app_store_review_attachments: maximum number of related appStoreReviewAttachments returned (when they are included)
    :type limit_app_store_review_attachments: int

    :rtype: Union[AppStoreReviewDetailResponse, Tuple[AppStoreReviewDetailResponse, int], Tuple[AppStoreReviewDetailResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_review_details_update_instance(id, app_store_review_detail_update_request):  # noqa: E501
    """app_store_review_details_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_store_review_detail_update_request: AppStoreReviewDetail representation
    :type app_store_review_detail_update_request: dict | bytes

    :rtype: Union[AppStoreReviewDetailResponse, Tuple[AppStoreReviewDetailResponse, int], Tuple[AppStoreReviewDetailResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_review_detail_update_request = AppStoreReviewDetailUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
