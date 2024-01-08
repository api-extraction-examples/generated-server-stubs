import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_app_review_detail_response import BetaAppReviewDetailResponse  # noqa: E501
from openapi_server.models.beta_app_review_detail_update_request import BetaAppReviewDetailUpdateRequest  # noqa: E501
from openapi_server.models.beta_app_review_details_response import BetaAppReviewDetailsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_app_review_details_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """beta_app_review_details_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_review_details_get_collection(filter_app, fields_beta_app_review_details=None, limit=None, include=None, fields_apps=None):  # noqa: E501
    """beta_app_review_details_get_collection

     # noqa: E501

    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param fields_beta_app_review_details: the fields to include for returned resources of type betaAppReviewDetails
    :type fields_beta_app_review_details: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[BetaAppReviewDetailsResponse, Tuple[BetaAppReviewDetailsResponse, int], Tuple[BetaAppReviewDetailsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_review_details_get_instance(id, fields_beta_app_review_details=None, include=None, fields_apps=None):  # noqa: E501
    """beta_app_review_details_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_app_review_details: the fields to include for returned resources of type betaAppReviewDetails
    :type fields_beta_app_review_details: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[BetaAppReviewDetailResponse, Tuple[BetaAppReviewDetailResponse, int], Tuple[BetaAppReviewDetailResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_app_review_details_update_instance(id, beta_app_review_detail_update_request):  # noqa: E501
    """beta_app_review_details_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_app_review_detail_update_request: BetaAppReviewDetail representation
    :type beta_app_review_detail_update_request: dict | bytes

    :rtype: Union[BetaAppReviewDetailResponse, Tuple[BetaAppReviewDetailResponse, int], Tuple[BetaAppReviewDetailResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_app_review_detail_update_request = BetaAppReviewDetailUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
