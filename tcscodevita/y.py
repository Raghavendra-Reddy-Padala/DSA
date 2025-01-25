def find_matching_earrings():
    N = int(input().strip())
    earrings = {}

    for i in range(N):
        K = int(input().strip())
        vertices = []
        for _ in range(K):
            x, y = map(int, input().strip().split())
            vertices.append((x, y))

        # Normalize the vertices by sorting
        vertices_sorted = sorted(vertices)

        # Generate mirrored vertices (reflection across the y-axis)
        vertices_mirrored = sorted([(-x, y) for x, y in vertices])

        # Convert both to string representations for comparison
        vertices_str = str(vertices_sorted)
        mirrored_str = str(vertices_mirrored)

        # Check if either version already exists in the dictionary
        if vertices_str in earrings:
            print(earrings[vertices_str], i)
        elif mirrored_str in earrings:
            print(earrings[mirrored_str], i)
        else:
            earrings[vertices_str] = i  # Store the index for the original
            earrings[mirrored_str] = i  # Also store the mirrored version for matching

find_matching_earrings()
