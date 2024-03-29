from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectFeatureFlags(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, build_fork_prs=None, fleet=None, junit=None, oss=None, osx=None, set_github_status=None, trusty_beta=None):  # noqa: E501
        """ProjectFeatureFlags - a model defined in OpenAPI

        :param build_fork_prs: The build_fork_prs of this ProjectFeatureFlags.  # noqa: E501
        :type build_fork_prs: bool
        :param fleet: The fleet of this ProjectFeatureFlags.  # noqa: E501
        :type fleet: bool
        :param junit: The junit of this ProjectFeatureFlags.  # noqa: E501
        :type junit: bool
        :param oss: The oss of this ProjectFeatureFlags.  # noqa: E501
        :type oss: bool
        :param osx: The osx of this ProjectFeatureFlags.  # noqa: E501
        :type osx: bool
        :param set_github_status: The set_github_status of this ProjectFeatureFlags.  # noqa: E501
        :type set_github_status: bool
        :param trusty_beta: The trusty_beta of this ProjectFeatureFlags.  # noqa: E501
        :type trusty_beta: bool
        """
        self.openapi_types = {
            'build_fork_prs': bool,
            'fleet': bool,
            'junit': bool,
            'oss': bool,
            'osx': bool,
            'set_github_status': bool,
            'trusty_beta': bool
        }

        self.attribute_map = {
            'build_fork_prs': 'build-fork-prs',
            'fleet': 'fleet',
            'junit': 'junit',
            'oss': 'oss',
            'osx': 'osx',
            'set_github_status': 'set-github-status',
            'trusty_beta': 'trusty-beta'
        }

        self._build_fork_prs = build_fork_prs
        self._fleet = fleet
        self._junit = junit
        self._oss = oss
        self._osx = osx
        self._set_github_status = set_github_status
        self._trusty_beta = trusty_beta

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectFeatureFlags':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Project_feature_flags of this ProjectFeatureFlags.  # noqa: E501
        :rtype: ProjectFeatureFlags
        """
        return util.deserialize_model(dikt, cls)

    @property
    def build_fork_prs(self) -> bool:
        """Gets the build_fork_prs of this ProjectFeatureFlags.


        :return: The build_fork_prs of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._build_fork_prs

    @build_fork_prs.setter
    def build_fork_prs(self, build_fork_prs: bool):
        """Sets the build_fork_prs of this ProjectFeatureFlags.


        :param build_fork_prs: The build_fork_prs of this ProjectFeatureFlags.
        :type build_fork_prs: bool
        """

        self._build_fork_prs = build_fork_prs

    @property
    def fleet(self) -> bool:
        """Gets the fleet of this ProjectFeatureFlags.


        :return: The fleet of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._fleet

    @fleet.setter
    def fleet(self, fleet: bool):
        """Sets the fleet of this ProjectFeatureFlags.


        :param fleet: The fleet of this ProjectFeatureFlags.
        :type fleet: bool
        """

        self._fleet = fleet

    @property
    def junit(self) -> bool:
        """Gets the junit of this ProjectFeatureFlags.


        :return: The junit of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._junit

    @junit.setter
    def junit(self, junit: bool):
        """Sets the junit of this ProjectFeatureFlags.


        :param junit: The junit of this ProjectFeatureFlags.
        :type junit: bool
        """

        self._junit = junit

    @property
    def oss(self) -> bool:
        """Gets the oss of this ProjectFeatureFlags.


        :return: The oss of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._oss

    @oss.setter
    def oss(self, oss: bool):
        """Sets the oss of this ProjectFeatureFlags.


        :param oss: The oss of this ProjectFeatureFlags.
        :type oss: bool
        """

        self._oss = oss

    @property
    def osx(self) -> bool:
        """Gets the osx of this ProjectFeatureFlags.


        :return: The osx of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._osx

    @osx.setter
    def osx(self, osx: bool):
        """Sets the osx of this ProjectFeatureFlags.


        :param osx: The osx of this ProjectFeatureFlags.
        :type osx: bool
        """

        self._osx = osx

    @property
    def set_github_status(self) -> bool:
        """Gets the set_github_status of this ProjectFeatureFlags.


        :return: The set_github_status of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._set_github_status

    @set_github_status.setter
    def set_github_status(self, set_github_status: bool):
        """Sets the set_github_status of this ProjectFeatureFlags.


        :param set_github_status: The set_github_status of this ProjectFeatureFlags.
        :type set_github_status: bool
        """

        self._set_github_status = set_github_status

    @property
    def trusty_beta(self) -> bool:
        """Gets the trusty_beta of this ProjectFeatureFlags.


        :return: The trusty_beta of this ProjectFeatureFlags.
        :rtype: bool
        """
        return self._trusty_beta

    @trusty_beta.setter
    def trusty_beta(self, trusty_beta: bool):
        """Sets the trusty_beta of this ProjectFeatureFlags.


        :param trusty_beta: The trusty_beta of this ProjectFeatureFlags.
        :type trusty_beta: bool
        """

        self._trusty_beta = trusty_beta
