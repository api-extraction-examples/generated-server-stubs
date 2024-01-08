import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.package_info import PackageInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.repository_info import RepositoryInfo  # noqa: E501
from openapi_server import util


def cancel_package_installation(package_id):  # noqa: E501
    """Cancels a package installation.

     # noqa: E501

    :param package_id: Installation Id.
    :type package_id: str
    :type package_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_package_info(name, assembly_guid=None):  # noqa: E501
    """Gets a package by name or assembly GUID.

     # noqa: E501

    :param name: The name of the package.
    :type name: str
    :param assembly_guid: The GUID of the associated assembly.
    :type assembly_guid: str
    :type assembly_guid: str

    :rtype: Union[PackageInfo, Tuple[PackageInfo, int], Tuple[PackageInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_packages():  # noqa: E501
    """Gets available packages.

     # noqa: E501


    :rtype: Union[List[PackageInfo], Tuple[List[PackageInfo], int], Tuple[List[PackageInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_repositories():  # noqa: E501
    """Gets all package repositories.

     # noqa: E501


    :rtype: Union[List[RepositoryInfo], Tuple[List[RepositoryInfo], int], Tuple[List[RepositoryInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def install_package(name, assembly_guid=None, version=None, repository_url=None):  # noqa: E501
    """Installs a package.

     # noqa: E501

    :param name: Package name.
    :type name: str
    :param assembly_guid: GUID of the associated assembly.
    :type assembly_guid: str
    :type assembly_guid: str
    :param version: Optional version. Defaults to latest version.
    :type version: str
    :param repository_url: Optional. Specify the repository to install from.
    :type repository_url: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_repositories(repository_info=None):  # noqa: E501
    """Sets the enabled and existing package repositories.

     # noqa: E501

    :param repository_info: The list of package repositories.
    :type repository_info: list | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        repository_info = [RepositoryInfo.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
