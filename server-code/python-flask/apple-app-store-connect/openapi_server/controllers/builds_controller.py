import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_encryption_declaration_response import AppEncryptionDeclarationResponse  # noqa: E501
from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.app_store_version_response import AppStoreVersionResponse  # noqa: E501
from openapi_server.models.beta_app_review_submission_response import BetaAppReviewSubmissionResponse  # noqa: E501
from openapi_server.models.beta_build_localizations_response import BetaBuildLocalizationsResponse  # noqa: E501
from openapi_server.models.beta_testers_response import BetaTestersResponse  # noqa: E501
from openapi_server.models.build_app_encryption_declaration_linkage_request import BuildAppEncryptionDeclarationLinkageRequest  # noqa: E501
from openapi_server.models.build_app_encryption_declaration_linkage_response import BuildAppEncryptionDeclarationLinkageResponse  # noqa: E501
from openapi_server.models.build_beta_detail_response import BuildBetaDetailResponse  # noqa: E501
from openapi_server.models.build_beta_groups_linkages_request import BuildBetaGroupsLinkagesRequest  # noqa: E501
from openapi_server.models.build_icons_response import BuildIconsResponse  # noqa: E501
from openapi_server.models.build_individual_testers_linkages_request import BuildIndividualTestersLinkagesRequest  # noqa: E501
from openapi_server.models.build_individual_testers_linkages_response import BuildIndividualTestersLinkagesResponse  # noqa: E501
from openapi_server.models.build_response import BuildResponse  # noqa: E501
from openapi_server.models.build_update_request import BuildUpdateRequest  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.diagnostic_signatures_response import DiagnosticSignaturesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.perf_power_metrics_response import PerfPowerMetricsResponse  # noqa: E501
from openapi_server.models.prerelease_version_response import PrereleaseVersionResponse  # noqa: E501
from openapi_server import util


def builds_app_encryption_declaration_get_to_one_related(id, fields_app_encryption_declarations=None):  # noqa: E501
    """builds_app_encryption_declaration_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_encryption_declarations: the fields to include for returned resources of type appEncryptionDeclarations
    :type fields_app_encryption_declarations: List[str]

    :rtype: Union[AppEncryptionDeclarationResponse, Tuple[AppEncryptionDeclarationResponse, int], Tuple[AppEncryptionDeclarationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_app_encryption_declaration_get_to_one_relationship(id):  # noqa: E501
    """builds_app_encryption_declaration_get_to_one_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[BuildAppEncryptionDeclarationLinkageResponse, Tuple[BuildAppEncryptionDeclarationLinkageResponse, int], Tuple[BuildAppEncryptionDeclarationLinkageResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_app_encryption_declaration_update_to_one_relationship(id, build_app_encryption_declaration_linkage_request):  # noqa: E501
    """builds_app_encryption_declaration_update_to_one_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_app_encryption_declaration_linkage_request: Related linkage
    :type build_app_encryption_declaration_linkage_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_app_encryption_declaration_linkage_request = BuildAppEncryptionDeclarationLinkageRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def builds_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """builds_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_app_store_version_get_to_one_related(id, fields_app_store_versions=None):  # noqa: E501
    """builds_app_store_version_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_store_versions: the fields to include for returned resources of type appStoreVersions
    :type fields_app_store_versions: List[str]

    :rtype: Union[AppStoreVersionResponse, Tuple[AppStoreVersionResponse, int], Tuple[AppStoreVersionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_beta_app_review_submission_get_to_one_related(id, fields_beta_app_review_submissions=None):  # noqa: E501
    """builds_beta_app_review_submission_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_app_review_submissions: the fields to include for returned resources of type betaAppReviewSubmissions
    :type fields_beta_app_review_submissions: List[str]

    :rtype: Union[BetaAppReviewSubmissionResponse, Tuple[BetaAppReviewSubmissionResponse, int], Tuple[BetaAppReviewSubmissionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_beta_build_localizations_get_to_many_related(id, fields_beta_build_localizations=None, limit=None):  # noqa: E501
    """builds_beta_build_localizations_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_build_localizations: the fields to include for returned resources of type betaBuildLocalizations
    :type fields_beta_build_localizations: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaBuildLocalizationsResponse, Tuple[BetaBuildLocalizationsResponse, int], Tuple[BetaBuildLocalizationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_beta_groups_create_to_many_relationship(id, build_beta_groups_linkages_request):  # noqa: E501
    """builds_beta_groups_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_beta_groups_linkages_request: List of related linkages
    :type build_beta_groups_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_beta_groups_linkages_request = BuildBetaGroupsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def builds_beta_groups_delete_to_many_relationship(id, build_beta_groups_linkages_request):  # noqa: E501
    """builds_beta_groups_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_beta_groups_linkages_request: List of related linkages
    :type build_beta_groups_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_beta_groups_linkages_request = BuildBetaGroupsLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def builds_build_beta_detail_get_to_one_related(id, fields_build_beta_details=None):  # noqa: E501
    """builds_build_beta_detail_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_build_beta_details: the fields to include for returned resources of type buildBetaDetails
    :type fields_build_beta_details: List[str]

    :rtype: Union[BuildBetaDetailResponse, Tuple[BuildBetaDetailResponse, int], Tuple[BuildBetaDetailResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_diagnostic_signatures_get_to_many_related(id, filter_diagnostic_type=None, fields_diagnostic_signatures=None, limit=None):  # noqa: E501
    """builds_diagnostic_signatures_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param filter_diagnostic_type: filter by attribute &#39;diagnosticType&#39;
    :type filter_diagnostic_type: List[str]
    :param fields_diagnostic_signatures: the fields to include for returned resources of type diagnosticSignatures
    :type fields_diagnostic_signatures: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[DiagnosticSignaturesResponse, Tuple[DiagnosticSignaturesResponse, int], Tuple[DiagnosticSignaturesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_get_collection(filter_beta_app_review_submission_beta_review_state=None, filter_expired=None, filter_pre_release_version_platform=None, filter_pre_release_version_version=None, filter_processing_state=None, filter_uses_non_exempt_encryption=None, filter_version=None, filter_app=None, filter_app_store_version=None, filter_beta_groups=None, filter_pre_release_version=None, filter_id=None, sort=None, fields_builds=None, limit=None, include=None, fields_app_encryption_declarations=None, fields_beta_app_review_submissions=None, fields_build_beta_details=None, fields_build_icons=None, fields_perf_power_metrics=None, fields_pre_release_versions=None, fields_app_store_versions=None, fields_diagnostic_signatures=None, fields_beta_testers=None, fields_beta_build_localizations=None, fields_apps=None, limit_beta_build_localizations=None, limit_icons=None, limit_individual_testers=None):  # noqa: E501
    """builds_get_collection

     # noqa: E501

    :param filter_beta_app_review_submission_beta_review_state: filter by attribute &#39;betaAppReviewSubmission.betaReviewState&#39;
    :type filter_beta_app_review_submission_beta_review_state: List[str]
    :param filter_expired: filter by attribute &#39;expired&#39;
    :type filter_expired: List[str]
    :param filter_pre_release_version_platform: filter by attribute &#39;preReleaseVersion.platform&#39;
    :type filter_pre_release_version_platform: List[str]
    :param filter_pre_release_version_version: filter by attribute &#39;preReleaseVersion.version&#39;
    :type filter_pre_release_version_version: List[str]
    :param filter_processing_state: filter by attribute &#39;processingState&#39;
    :type filter_processing_state: List[str]
    :param filter_uses_non_exempt_encryption: filter by attribute &#39;usesNonExemptEncryption&#39;
    :type filter_uses_non_exempt_encryption: List[str]
    :param filter_version: filter by attribute &#39;version&#39;
    :type filter_version: List[str]
    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param filter_app_store_version: filter by id(s) of related &#39;appStoreVersion&#39;
    :type filter_app_store_version: List[str]
    :param filter_beta_groups: filter by id(s) of related &#39;betaGroups&#39;
    :type filter_beta_groups: List[str]
    :param filter_pre_release_version: filter by id(s) of related &#39;preReleaseVersion&#39;
    :type filter_pre_release_version: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_encryption_declarations: the fields to include for returned resources of type appEncryptionDeclarations
    :type fields_app_encryption_declarations: List[str]
    :param fields_beta_app_review_submissions: the fields to include for returned resources of type betaAppReviewSubmissions
    :type fields_beta_app_review_submissions: List[str]
    :param fields_build_beta_details: the fields to include for returned resources of type buildBetaDetails
    :type fields_build_beta_details: List[str]
    :param fields_build_icons: the fields to include for returned resources of type buildIcons
    :type fields_build_icons: List[str]
    :param fields_perf_power_metrics: the fields to include for returned resources of type perfPowerMetrics
    :type fields_perf_power_metrics: List[str]
    :param fields_pre_release_versions: the fields to include for returned resources of type preReleaseVersions
    :type fields_pre_release_versions: List[str]
    :param fields_app_store_versions: the fields to include for returned resources of type appStoreVersions
    :type fields_app_store_versions: List[str]
    :param fields_diagnostic_signatures: the fields to include for returned resources of type diagnosticSignatures
    :type fields_diagnostic_signatures: List[str]
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param fields_beta_build_localizations: the fields to include for returned resources of type betaBuildLocalizations
    :type fields_beta_build_localizations: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_beta_build_localizations: maximum number of related betaBuildLocalizations returned (when they are included)
    :type limit_beta_build_localizations: int
    :param limit_icons: maximum number of related icons returned (when they are included)
    :type limit_icons: int
    :param limit_individual_testers: maximum number of related individualTesters returned (when they are included)
    :type limit_individual_testers: int

    :rtype: Union[BuildsResponse, Tuple[BuildsResponse, int], Tuple[BuildsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_get_instance(id, fields_builds=None, include=None, fields_app_encryption_declarations=None, fields_beta_app_review_submissions=None, fields_build_beta_details=None, fields_build_icons=None, fields_perf_power_metrics=None, fields_pre_release_versions=None, fields_app_store_versions=None, fields_diagnostic_signatures=None, fields_beta_testers=None, fields_beta_build_localizations=None, fields_apps=None, limit_beta_build_localizations=None, limit_icons=None, limit_individual_testers=None):  # noqa: E501
    """builds_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_builds: the fields to include for returned resources of type builds
    :type fields_builds: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_encryption_declarations: the fields to include for returned resources of type appEncryptionDeclarations
    :type fields_app_encryption_declarations: List[str]
    :param fields_beta_app_review_submissions: the fields to include for returned resources of type betaAppReviewSubmissions
    :type fields_beta_app_review_submissions: List[str]
    :param fields_build_beta_details: the fields to include for returned resources of type buildBetaDetails
    :type fields_build_beta_details: List[str]
    :param fields_build_icons: the fields to include for returned resources of type buildIcons
    :type fields_build_icons: List[str]
    :param fields_perf_power_metrics: the fields to include for returned resources of type perfPowerMetrics
    :type fields_perf_power_metrics: List[str]
    :param fields_pre_release_versions: the fields to include for returned resources of type preReleaseVersions
    :type fields_pre_release_versions: List[str]
    :param fields_app_store_versions: the fields to include for returned resources of type appStoreVersions
    :type fields_app_store_versions: List[str]
    :param fields_diagnostic_signatures: the fields to include for returned resources of type diagnosticSignatures
    :type fields_diagnostic_signatures: List[str]
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param fields_beta_build_localizations: the fields to include for returned resources of type betaBuildLocalizations
    :type fields_beta_build_localizations: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]
    :param limit_beta_build_localizations: maximum number of related betaBuildLocalizations returned (when they are included)
    :type limit_beta_build_localizations: int
    :param limit_icons: maximum number of related icons returned (when they are included)
    :type limit_icons: int
    :param limit_individual_testers: maximum number of related individualTesters returned (when they are included)
    :type limit_individual_testers: int

    :rtype: Union[BuildResponse, Tuple[BuildResponse, int], Tuple[BuildResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_icons_get_to_many_related(id, fields_build_icons=None, limit=None):  # noqa: E501
    """builds_icons_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_build_icons: the fields to include for returned resources of type buildIcons
    :type fields_build_icons: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BuildIconsResponse, Tuple[BuildIconsResponse, int], Tuple[BuildIconsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_individual_testers_create_to_many_relationship(id, build_individual_testers_linkages_request):  # noqa: E501
    """builds_individual_testers_create_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_individual_testers_linkages_request: List of related linkages
    :type build_individual_testers_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_individual_testers_linkages_request = BuildIndividualTestersLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def builds_individual_testers_delete_to_many_relationship(id, build_individual_testers_linkages_request):  # noqa: E501
    """builds_individual_testers_delete_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_individual_testers_linkages_request: List of related linkages
    :type build_individual_testers_linkages_request: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_individual_testers_linkages_request = BuildIndividualTestersLinkagesRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def builds_individual_testers_get_to_many_related(id, fields_beta_testers=None, limit=None):  # noqa: E501
    """builds_individual_testers_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_testers: the fields to include for returned resources of type betaTesters
    :type fields_beta_testers: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BetaTestersResponse, Tuple[BetaTestersResponse, int], Tuple[BetaTestersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_individual_testers_get_to_many_relationship(id, limit=None):  # noqa: E501
    """builds_individual_testers_get_to_many_relationship

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[BuildIndividualTestersLinkagesResponse, Tuple[BuildIndividualTestersLinkagesResponse, int], Tuple[BuildIndividualTestersLinkagesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_perf_power_metrics_get_to_many_related(id, filter_device_type=None, filter_metric_type=None, filter_platform=None):  # noqa: E501
    """builds_perf_power_metrics_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param filter_device_type: filter by attribute &#39;deviceType&#39;
    :type filter_device_type: List[str]
    :param filter_metric_type: filter by attribute &#39;metricType&#39;
    :type filter_metric_type: List[str]
    :param filter_platform: filter by attribute &#39;platform&#39;
    :type filter_platform: List[str]

    :rtype: Union[PerfPowerMetricsResponse, Tuple[PerfPowerMetricsResponse, int], Tuple[PerfPowerMetricsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_pre_release_version_get_to_one_related(id, fields_pre_release_versions=None):  # noqa: E501
    """builds_pre_release_version_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_pre_release_versions: the fields to include for returned resources of type preReleaseVersions
    :type fields_pre_release_versions: List[str]

    :rtype: Union[PrereleaseVersionResponse, Tuple[PrereleaseVersionResponse, int], Tuple[PrereleaseVersionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def builds_update_instance(id, build_update_request):  # noqa: E501
    """builds_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param build_update_request: Build representation
    :type build_update_request: dict | bytes

    :rtype: Union[BuildResponse, Tuple[BuildResponse, int], Tuple[BuildResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_update_request = BuildUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
