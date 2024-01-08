import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_store_review_attachment_create_request import AppStoreReviewAttachmentCreateRequest  # noqa: E501
from openapi_server.models.app_store_review_attachment_response import AppStoreReviewAttachmentResponse  # noqa: E501
from openapi_server.models.app_store_review_attachment_update_request import AppStoreReviewAttachmentUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_store_review_attachments_create_instance(app_store_review_attachment_create_request):  # noqa: E501
    """app_store_review_attachments_create_instance

     # noqa: E501

    :param app_store_review_attachment_create_request: AppStoreReviewAttachment representation
    :type app_store_review_attachment_create_request: dict | bytes

    :rtype: Union[AppStoreReviewAttachmentResponse, Tuple[AppStoreReviewAttachmentResponse, int], Tuple[AppStoreReviewAttachmentResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_review_attachment_create_request = AppStoreReviewAttachmentCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_review_attachments_delete_instance(id):  # noqa: E501
    """app_store_review_attachments_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_review_attachments_get_instance(id, fields_app_store_review_attachments=None, include=None):  # noqa: E501
    """app_store_review_attachments_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_review_attachments: the fields to include for returned resources of type appStoreReviewAttachments
    :type fields_app_store_review_attachments: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppStoreReviewAttachmentResponse, Tuple[AppStoreReviewAttachmentResponse, int], Tuple[AppStoreReviewAttachmentResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_review_attachments_update_instance(id, app_store_review_attachment_update_request):  # noqa: E501
    """app_store_review_attachments_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_store_review_attachment_update_request: AppStoreReviewAttachment representation
    :type app_store_review_attachment_update_request: dict | bytes

    :rtype: Union[AppStoreReviewAttachmentResponse, Tuple[AppStoreReviewAttachmentResponse, int], Tuple[AppStoreReviewAttachmentResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_review_attachment_update_request = AppStoreReviewAttachmentUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
