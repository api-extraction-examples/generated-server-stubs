import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_license_agreement_response import BetaLicenseAgreementResponse  # noqa: E501
from openapi_server.models.beta_license_agreement_update_request import BetaLicenseAgreementUpdateRequest  # noqa: E501
from openapi_server.models.beta_license_agreements_response import BetaLicenseAgreementsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_license_agreements_app_get_to_one_related(id, fields_apps=None):  # noqa: E501
    """beta_license_agreements_app_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[AppResponse, Tuple[AppResponse, int], Tuple[AppResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_license_agreements_get_collection(filter_app=None, fields_beta_license_agreements=None, limit=None, include=None, fields_apps=None):  # noqa: E501
    """beta_license_agreements_get_collection

     # noqa: E501

    :param filter_app: filter by id(s) of related &#39;app&#39;
    :type filter_app: List[str]
    :param fields_beta_license_agreements: the fields to include for returned resources of type betaLicenseAgreements
    :type fields_beta_license_agreements: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[BetaLicenseAgreementsResponse, Tuple[BetaLicenseAgreementsResponse, int], Tuple[BetaLicenseAgreementsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_license_agreements_get_instance(id, fields_beta_license_agreements=None, include=None, fields_apps=None):  # noqa: E501
    """beta_license_agreements_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_beta_license_agreements: the fields to include for returned resources of type betaLicenseAgreements
    :type fields_beta_license_agreements: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_apps: the fields to include for returned resources of type apps
    :type fields_apps: List[str]

    :rtype: Union[BetaLicenseAgreementResponse, Tuple[BetaLicenseAgreementResponse, int], Tuple[BetaLicenseAgreementResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def beta_license_agreements_update_instance(id, beta_license_agreement_update_request):  # noqa: E501
    """beta_license_agreements_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param beta_license_agreement_update_request: BetaLicenseAgreement representation
    :type beta_license_agreement_update_request: dict | bytes

    :rtype: Union[BetaLicenseAgreementResponse, Tuple[BetaLicenseAgreementResponse, int], Tuple[BetaLicenseAgreementResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_license_agreement_update_request = BetaLicenseAgreementUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
