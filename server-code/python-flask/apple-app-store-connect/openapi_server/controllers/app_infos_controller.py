import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.age_rating_declaration_response import AgeRatingDeclarationResponse  # noqa: E501
from openapi_server.models.app_category_response import AppCategoryResponse  # noqa: E501
from openapi_server.models.app_info_localizations_response import AppInfoLocalizationsResponse  # noqa: E501
from openapi_server.models.app_info_response import AppInfoResponse  # noqa: E501
from openapi_server.models.app_info_update_request import AppInfoUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_infos_age_rating_declaration_get_to_one_related(id, fields_age_rating_declarations=None):  # noqa: E501
    """app_infos_age_rating_declaration_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_age_rating_declarations: the fields to include for returned resources of type ageRatingDeclarations
    :type fields_age_rating_declarations: List[str]

    :rtype: Union[AgeRatingDeclarationResponse, Tuple[AgeRatingDeclarationResponse, int], Tuple[AgeRatingDeclarationResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_app_info_localizations_get_to_many_related(id, filter_locale=None, fields_app_infos=None, fields_app_info_localizations=None, limit=None, include=None):  # noqa: E501
    """app_infos_app_info_localizations_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param filter_locale: filter by attribute &#39;locale&#39;
    :type filter_locale: List[str]
    :param fields_app_infos: the fields to include for returned resources of type appInfos
    :type fields_app_infos: List[str]
    :param fields_app_info_localizations: the fields to include for returned resources of type appInfoLocalizations
    :type fields_app_info_localizations: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppInfoLocalizationsResponse, Tuple[AppInfoLocalizationsResponse, int], Tuple[AppInfoLocalizationsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_get_instance(id, fields_app_infos=None, include=None, fields_age_rating_declarations=None, fields_app_categories=None, fields_app_info_localizations=None, limit_app_info_localizations=None):  # noqa: E501
    """app_infos_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_infos: the fields to include for returned resources of type appInfos
    :type fields_app_infos: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_age_rating_declarations: the fields to include for returned resources of type ageRatingDeclarations
    :type fields_age_rating_declarations: List[str]
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]
    :param fields_app_info_localizations: the fields to include for returned resources of type appInfoLocalizations
    :type fields_app_info_localizations: List[str]
    :param limit_app_info_localizations: maximum number of related appInfoLocalizations returned (when they are included)
    :type limit_app_info_localizations: int

    :rtype: Union[AppInfoResponse, Tuple[AppInfoResponse, int], Tuple[AppInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_primary_category_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_infos_primary_category_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_primary_subcategory_one_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_infos_primary_subcategory_one_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_primary_subcategory_two_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_infos_primary_subcategory_two_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_secondary_category_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_infos_secondary_category_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_secondary_subcategory_one_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_infos_secondary_subcategory_one_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_secondary_subcategory_two_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_infos_secondary_subcategory_two_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_infos_update_instance(id, app_info_update_request):  # noqa: E501
    """app_infos_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_info_update_request: AppInfo representation
    :type app_info_update_request: dict | bytes

    :rtype: Union[AppInfoResponse, Tuple[AppInfoResponse, int], Tuple[AppInfoResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_info_update_request = AppInfoUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
