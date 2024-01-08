import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.age_rating_declaration_response import AgeRatingDeclarationResponse  # noqa: E501
from openapi_server.models.app_store_review_detail_response import AppStoreReviewDetailResponse  # noqa: E501
from openapi_server.models.app_store_version_build_linkage_request import AppStoreVersionBuildLinkageRequest  # noqa: E501
from openapi_server.models.app_store_version_build_linkage_response import AppStoreVersionBuildLinkageResponse  # noqa: E501
from openapi_server.models.app_store_version_create_request import AppStoreVersionCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_localizations_response import AppStoreVersionLocalizationsResponse  # noqa: E501
from openapi_server.models.app_store_version_phased_release_response import AppStoreVersionPhasedReleaseResponse  # noqa: E501
from openapi_server.models.app_store_version_response import AppStoreVersionResponse  # noqa: E501
from openapi_server.models.app_store_version_submission_response import AppStoreVersionSubmissionResponse  # noqa: E501
from openapi_server.models.app_store_version_update_request import AppStoreVersionUpdateRequest  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.idfa_declaration_response import IdfaDeclarationResponse  # noqa: E501
from openapi_server.models.routing_app_coverage_response import RoutingAppCoverageResponse  # noqa: E501
from openapi_server import util


def app_store_versions_age_rating_declaration_get_to_one_related(id, fields_age_rating_declarations=None):  # noqa: E501
    """app_store_versions_age_rating_declaration_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_age_rating_declarations: the fields to include for returned resources of type ageRatingDeclarations
    :type fields_age_rating_declarations: List[str]

    :rtype: Union[AgeRatingDeclarationResponse, Tuple[AgeRatingDeclarationResponse, int], Tuple[AgeRatingDeclarationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_app_store_review_detail_get_to_one_related(id, fields_app_store_review_details=None, fields_app_store_versions=None, fields_app_store_review_attachments=None, include=None):  # noqa: E501
    """app_store_versions_app_store_review_detail_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_review_details: the fields to include for returned resources of type appStoreReviewDetails
    :type fields_app_store_review_details: List[str]
    :param fields_app_store_versions: the fields to include for returned resources of type appStoreVersions
    :type fields_app_store_versions: List[str]
    :param fields_app_store_review_attachments: the fields to include for returned resources of type appStoreReviewAttachments
    :type fields_app_store_review_attachments: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppStoreReviewDetailResponse, Tuple[AppStoreReviewDetailResponse, int], Tuple[AppStoreReviewDetailResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_app_store_version_localizations_get_to_many_related(id, fields_app_store_version_localizations=None, limit=None):  # noqa: E501
    """app_store_versions_app_store_version_localizations_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_version_localizations: the fields to include for returned resources of type appStoreVersionLocalizations
    :type fields_app_store_version_localizations: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppStoreVersionLocalizationsResponse, Tuple[AppStoreVersionLocalizationsResponse, int], Tuple[AppStoreVersionLocalizationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_app_store_version_phased_release_get_to_one_related(id, fields_app_store_version_phased_releases=None):  # noqa: E501
    """app_store_versions_app_store_version_phased_release_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_version_phased_releases: the fields to include for returned resources of type appStoreVersionPhasedReleases
    :type fields_app_store_version_phased_releases: List[str]

    :rtype: Union[AppStoreVersionPhasedReleaseResponse, Tuple[AppStoreVersionPhasedReleaseResponse, int], Tuple[AppStoreVersionPhasedReleaseResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_app_store_version_submission_get_to_one_related(id, fields_app_store_versions=None, fields_app_store_version_submissions=None, include=None):  # noqa: E501
    """app_store_versions_app_store_version_submission_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_versions: the fields to include for returned resources of type appStoreVersions
    :type fields_app_store_versions: List[str]
    :param fields_app_store_version_submissions: the fields to include for returned resources of type appStoreVersionSubmissions
    :type fields_app_store_version_submissions: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppStoreVersionSubmissionResponse, Tuple[AppStoreVersionSubmissionResponse, int], Tuple[AppStoreVersionSubmissionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_build_get_to_one_related(id, fields_builds=None):  # noqa: E501
    """app_store_versions_build_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]

    :rtype: Union[BuildResponse, Tuple[BuildResponse, int], Tuple[BuildResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_build_get_to_one_relationship(id):  # noqa: E501
    """app_store_versions_build_get_to_one_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[AppStoreVersionBuildLinkageResponse, Tuple[AppStoreVersionBuildLinkageResponse, int], Tuple[AppStoreVersionBuildLinkageResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_build_update_to_one_relationship(id, app_store_version_build_linkage_request):  # noqa: E501
    """app_store_versions_build_update_to_one_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_store_version_build_linkage_request: Related linkage
    :type app_store_version_build_linkage_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_build_linkage_request = AppStoreVersionBuildLinkageRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_versions_create_instance(app_store_version_create_request):  # noqa: E501
    """app_store_versions_create_instance

     # noqa: E501

    :param app_store_version_create_request: AppStoreVersion representation
    :type app_store_version_create_request: dict | bytes

    :rtype: Union[AppStoreVersionResponse, Tuple[AppStoreVersionResponse, int], Tuple[AppStoreVersionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_create_request = AppStoreVersionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_store_versions_delete_instance(id):  # noqa: E501
    """app_store_versions_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_get_instance(id, fields_app_store_versions=None, include=None, fields_app_store_version_localizations=None, fields_idfa_declarations=None, fields_routing_app_coverages=None, fields_app_store_version_phased_releases=None, fields_age_rating_declarations=None, fields_app_store_review_details=None, fields_builds=None, fields_app_store_version_submissions=None, limit_app_store_version_localizations=None):  # noqa: E501
    """app_store_versions_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_versions: the fields to include for returned resources of type appStoreVersions
    :type fields_app_store_versions: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_store_version_localizations: the fields to include for returned resources of type appStoreVersionLocalizations
    :type fields_app_store_version_localizations: List[str]
    :param fields_idfa_declarations: the fields to include for returned resources of type idfaDeclarations
    :type fields_idfa_declarations: List[str]
    :param fields_routing_app_coverages: the fields to include for returned resources of type routingAppCoverages
    :type fields_routing_app_coverages: List[str]
    :param fields_app_store_version_phased_releases: the fields to include for returned resources of type appStoreVersionPhasedReleases
    :type fields_app_store_version_phased_releases: List[str]
    :param fields_age_rating_declarations: the fields to include for returned resources of type ageRatingDeclarations
    :type fields_age_rating_declarations: List[str]
    :param fields_app_store_review_details: the fields to include for returned resources of type appStoreReviewDetails
    :type fields_app_store_review_details: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param fields_app_store_version_submissions: the fields to include for returned resources of type appStoreVersionSubmissions
    :type fields_app_store_version_submissions: List[str]
    :param limit_app_store_version_localizations: maximum number of related appStoreVersionLocalizations returned (when they are included)
    :type limit_app_store_version_localizations: int

    :rtype: Union[AppStoreVersionResponse, Tuple[AppStoreVersionResponse, int], Tuple[AppStoreVersionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_idfa_declaration_get_to_one_related(id, fields_idfa_declarations=None):  # noqa: E501
    """app_store_versions_idfa_declaration_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_idfa_declarations: the fields to include for returned resources of type idfaDeclarations
    :type fields_idfa_declarations: List[str]

    :rtype: Union[IdfaDeclarationResponse, Tuple[IdfaDeclarationResponse, int], Tuple[IdfaDeclarationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_routing_app_coverage_get_to_one_related(id, fields_routing_app_coverages=None):  # noqa: E501
    """app_store_versions_routing_app_coverage_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_routing_app_coverages: the fields to include for returned resources of type routingAppCoverages
    :type fields_routing_app_coverages: List[str]

    :rtype: Union[RoutingAppCoverageResponse, Tuple[RoutingAppCoverageResponse, int], Tuple[RoutingAppCoverageResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_store_versions_update_instance(id, app_store_version_update_request):  # noqa: E501
    """app_store_versions_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_store_version_update_request: AppStoreVersion representation
    :type app_store_version_update_request: dict | bytes

    :rtype: Union[AppStoreVersionResponse, Tuple[AppStoreVersionResponse, int], Tuple[AppStoreVersionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_store_version_update_request = AppStoreVersionUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
