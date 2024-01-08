import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.site import Site  # noqa: E501
from openapi_server.models.site_setup import SiteSetup  # noqa: E501
from openapi_server import util


def create_site(site, configure_dns=None):  # noqa: E501
    """create_site

    **Note:** Environment variable keys and values will soon be moved from &#x60;build_settings.env&#x60; and &#x60;repo.env&#x60; to a new endpoint. Please use [createEnvVars](#tag/environmentVariables/operation/createEnvVars) to create environment variables for a site. # noqa: E501

    :param site: 
    :type site: dict | bytes
    :param configure_dns: 
    :type configure_dns: bool

    :rtype: Union[Site, Tuple[Site, int], Tuple[Site, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        site = SiteSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_site_in_team(account_slug, configure_dns=None, site=None):  # noqa: E501
    """create_site_in_team

    **Note:** Environment variable keys and values will soon be moved from &#x60;build_settings.env&#x60; and &#x60;repo.env&#x60; to a new endpoint. Please use [createEnvVars](#tag/environmentVariables/operation/createEnvVars) to create environment variables for a site. # noqa: E501

    :param account_slug: 
    :type account_slug: str
    :param configure_dns: 
    :type configure_dns: bool
    :param site: 
    :type site: dict | bytes

    :rtype: Union[Site, Tuple[Site, int], Tuple[Site, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        site = SiteSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_site(site_id):  # noqa: E501
    """delete_site

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_site(site_id):  # noqa: E501
    """get_site

    **Note:** Environment variable keys and values will soon be moved from &#x60;build_settings.env&#x60; and &#x60;repo.env&#x60; to a new endpoint. Please use [getEnvVars](#tag/environmentVariables/operation/getEnvVars) to retrieve site environment variables. # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[Site, Tuple[Site, int], Tuple[Site, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_sites(name=None, filter=None, page=None, per_page=None):  # noqa: E501
    """list_sites

    **Note:** Environment variable keys and values will soon be moved from &#x60;build_settings.env&#x60; and &#x60;repo.env&#x60; to a new endpoint. Please use [getEnvVars](#tag/environmentVariables/operation/getEnvVars) to retrieve site environment variables. # noqa: E501

    :param name: 
    :type name: str
    :param filter: 
    :type filter: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Site], Tuple[List[Site], int], Tuple[List[Site], int, Dict[str, str]]
    """
    return 'do some magic!'


def list_sites_for_account(account_slug, name=None, page=None, per_page=None):  # noqa: E501
    """list_sites_for_account

    **Note:** Environment variable keys and values will soon be moved from &#x60;build_settings.env&#x60; and &#x60;repo.env&#x60; to a new endpoint. Please use [getEnvVars](#tag/environmentVariables/operation/getEnvVars) to retrieve site environment variables. # noqa: E501

    :param account_slug: 
    :type account_slug: str
    :param name: 
    :type name: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Site], Tuple[List[Site], int], Tuple[List[Site], int, Dict[str, str]]
    """
    return 'do some magic!'


def unlink_site_repo(site_id):  # noqa: E501
    """unlink_site_repo

    [Beta] Unlinks the repo from the site.  This action will also: - Delete associated deploy keys - Delete outgoing webhooks for the repo - Delete the site&#39;s build hooks # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[Site, Tuple[Site, int], Tuple[Site, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_site(site_id, site):  # noqa: E501
    """update_site

    **Note:** Environment variable keys and values will soon be moved from &#x60;build_settings.env&#x60; and &#x60;repo.env&#x60; to a new endpoint. Please use [updateEnvVar](#tag/environmentVariables/operation/updateEnvVar) to update a site&#39;s environment variables. # noqa: E501

    :param site_id: 
    :type site_id: str
    :param site: 
    :type site: dict | bytes

    :rtype: Union[Site, Tuple[Site, int], Tuple[Site, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        site = SiteSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
