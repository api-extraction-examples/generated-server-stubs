from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectUsernameProjectTreeBranchPostRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, build_parameters=None, parallel=None, revision=None):  # noqa: E501
        """ProjectUsernameProjectTreeBranchPostRequest - a model defined in OpenAPI

        :param build_parameters: The build_parameters of this ProjectUsernameProjectTreeBranchPostRequest.  # noqa: E501
        :type build_parameters: object
        :param parallel: The parallel of this ProjectUsernameProjectTreeBranchPostRequest.  # noqa: E501
        :type parallel: str
        :param revision: The revision of this ProjectUsernameProjectTreeBranchPostRequest.  # noqa: E501
        :type revision: str
        """
        self.openapi_types = {
            'build_parameters': object,
            'parallel': str,
            'revision': str
        }

        self.attribute_map = {
            'build_parameters': 'build_parameters',
            'parallel': 'parallel',
            'revision': 'revision'
        }

        self._build_parameters = build_parameters
        self._parallel = parallel
        self._revision = revision

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectUsernameProjectTreeBranchPostRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _project__username___project__tree__branch__post_request of this ProjectUsernameProjectTreeBranchPostRequest.  # noqa: E501
        :rtype: ProjectUsernameProjectTreeBranchPostRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def build_parameters(self) -> object:
        """Gets the build_parameters of this ProjectUsernameProjectTreeBranchPostRequest.

        Additional environment variables to inject into the build environment. A map of names to values.   # noqa: E501

        :return: The build_parameters of this ProjectUsernameProjectTreeBranchPostRequest.
        :rtype: object
        """
        return self._build_parameters

    @build_parameters.setter
    def build_parameters(self, build_parameters: object):
        """Sets the build_parameters of this ProjectUsernameProjectTreeBranchPostRequest.

        Additional environment variables to inject into the build environment. A map of names to values.   # noqa: E501

        :param build_parameters: The build_parameters of this ProjectUsernameProjectTreeBranchPostRequest.
        :type build_parameters: object
        """

        self._build_parameters = build_parameters

    @property
    def parallel(self) -> str:
        """Gets the parallel of this ProjectUsernameProjectTreeBranchPostRequest.

        The number of containers to use to run the build. Default is null and the project default is used.   # noqa: E501

        :return: The parallel of this ProjectUsernameProjectTreeBranchPostRequest.
        :rtype: str
        """
        return self._parallel

    @parallel.setter
    def parallel(self, parallel: str):
        """Sets the parallel of this ProjectUsernameProjectTreeBranchPostRequest.

        The number of containers to use to run the build. Default is null and the project default is used.   # noqa: E501

        :param parallel: The parallel of this ProjectUsernameProjectTreeBranchPostRequest.
        :type parallel: str
        """

        self._parallel = parallel

    @property
    def revision(self) -> str:
        """Gets the revision of this ProjectUsernameProjectTreeBranchPostRequest.

        The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter.   # noqa: E501

        :return: The revision of this ProjectUsernameProjectTreeBranchPostRequest.
        :rtype: str
        """
        return self._revision

    @revision.setter
    def revision(self, revision: str):
        """Sets the revision of this ProjectUsernameProjectTreeBranchPostRequest.

        The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter.   # noqa: E501

        :param revision: The revision of this ProjectUsernameProjectTreeBranchPostRequest.
        :type revision: str
        """

        self._revision = revision