import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.container_for_project_features import ContainerForProjectFeatures  # noqa: E501
from openapi_server.models.project_feature_state import ProjectFeatureState  # noqa: E501
from openapi_server import util


def get_features_for_project(project_id_or_key):  # noqa: E501
    """Get project features

    Returns the list of features for a project. # noqa: E501

    :param project_id_or_key: The ID or (case-sensitive) key of the project.
    :type project_id_or_key: str

    :rtype: Union[ContainerForProjectFeatures, Tuple[ContainerForProjectFeatures, int], Tuple[ContainerForProjectFeatures, int, Dict[str, str]]
    """
    return 'do some magic!'


def toggle_feature_for_project(project_id_or_key, feature_key, project_feature_state):  # noqa: E501
    """Set project feature state

    Sets the state of a project feature. # noqa: E501

    :param project_id_or_key: The ID or (case-sensitive) key of the project.
    :type project_id_or_key: str
    :param feature_key: The key of the feature.
    :type feature_key: str
    :param project_feature_state: Details of the feature state change.
    :type project_feature_state: dict | bytes

    :rtype: Union[ContainerForProjectFeatures, Tuple[ContainerForProjectFeatures, int], Tuple[ContainerForProjectFeatures, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_feature_state = ProjectFeatureState.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
